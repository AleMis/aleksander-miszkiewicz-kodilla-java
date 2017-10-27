package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="PRODUCTS")
public class Product {

    private int id;
    private String name;
    private List<Item> itemsList = new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name="ID")
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name="PRODUCT_NAME")
    public String getName() {
        return name;
    }

    @OneToMany(targetEntity = Item.class,
    cascade = CascadeType.ALL,
    fetch = FetchType.LAZY,
    mappedBy = "product")
    public List<Item> getItemsList() {
        return itemsList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }
}
