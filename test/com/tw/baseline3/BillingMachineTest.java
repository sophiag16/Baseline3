package com.tw.baseline3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BillingMachineTest {

    @Test
    public void produceReceiptForASingleNonTaxableItemList() {
        BillingMachine billingMachine = new BillingMachine("1 book at 12.49");

        assertEquals("1 book : 12.49\n" +
                "Sales Taxes : 0.0\n" +
                "Total : 12.49", billingMachine.produceReceipt());
    }

    @Test
    public void produceReceiptForAnotherSingleNonTaxableItemList() {
        BillingMachine billingMachine = new BillingMachine("1 chocolate bar at 0.85");

        assertEquals("1 chocolate bar : 0.85\n" +
                "Sales Taxes : 0.0\n" +
                "Total : 0.85", billingMachine.produceReceipt());
    }
}
