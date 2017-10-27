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
        Product monitor = new Product("Monitor");
        Product keyboard = new Product("Keyboard");
        Product mouse = new Product("Mouse");

        Item item1 = new Item(notebook, new BigDecimal(4000), 2);
        Item item2 = new Item(monitor, new BigDecimal(1000), 4);
        Item item3 = new Item(keyboard, new BigDecimal(200), 2);
        Item item4 = new Item(mouse, new BigDecimal(300), 2 );

        item1.setProduct(notebook);
        item2.setProduct(monitor);
        item3.setProduct(keyboard);
        item4.setProduct(mouse);

        notebook.getItemsList().add(item1);
        monitor.getItemsList().add(item2);
        keyboard.getItemsList().add(item3);
        mouse.getItemsList().add(item4);

        Invoice invoice = new Invoice("1/10/2017");
        invoice.getItemsList().add(item1);
        invoice.getItemsList().add(item2);
        invoice.getItemsList().add(item3);
        invoice.getItemsList().add(item4);

        item1.setInvoices(invoice);
        item2.setInvoices(invoice);
        item3.setInvoices(invoice);
        item4.setInvoices(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertEquals(1, id);

        //CleanUp
        invoiceDao.deleteAll();
    }
}
