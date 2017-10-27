package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="INVOICES")
public class Invoice {

    private int id;
    private String number;
    private List<Item> itemsList = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID")
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name="INVOICE_NUMBER")
    public String getNumber() {
        return number;
    }

    @OneToMany(targetEntity = Item.class,
    cascade = CascadeType.ALL,
    fetch = FetchType.LAZY,
    mappedBy = "invoices")
    public List<Item> getItemsList() {
        return itemsList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }
}
