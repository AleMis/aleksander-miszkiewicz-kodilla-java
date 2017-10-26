package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;


    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product notebook = new Product("Notebook");
        Product keyboard = new Product("Keyboard");
        Product monitor = new Product("Monitor");
        Product mouse = new Product("Mouse");

        Item item1 = new Item(notebook, new BigDecimal(5000), 2);
        Item item2 = new Item(keyboard, new BigDecimal(200), 4);
        Item item3 = new Item(monitor, new BigDecimal(1000), 2);
        Item item4 = new Item(mouse, new BigDecimal(300), 4);

        notebook.getItems().add(item1);
        keyboard.getItems().add(item2);
        monitor.getItems().add(item3);
        mouse.getItems().add(item4);

        item1.setProduct(notebook);
        item2.setProduct(keyboard);
        item3.setProduct(monitor);
        item4.setProduct(mouse);

        Invoice invoice = new Invoice();
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        item1.setInvoices(invoice);
        item2.setInvoices(invoice);
        item3.setInvoices(invoice);
        item4.setInvoices(invoice);


        //When
        invoiceDao.save(invoice);
        int size = invoice.getItems().size();
        int id = invoice.getId();

        //Then
        Assert.assertEquals(4, size);

        //CleanUp
//        invoiceDao.delete(id);
    }
}
