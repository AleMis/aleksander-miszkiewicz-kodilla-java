package com.kodilla.stream.invoice;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();
        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.00), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.00), 3.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.00), 5.0));
        //Then
        Assert.assertEquals(97, invoice.getValueToPay(), 0);
    }
}
