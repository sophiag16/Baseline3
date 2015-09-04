package com.tw.baseline3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BillingMachineTest {

    @Test
    public void produceReceiptForASingleItemList() {
        BillingMachine billingMachine = new BillingMachine("1 book at 12.49");

        assertEquals("1 book : 12.49\n" +
                "Sales Taxes : 0.0\n" +
                "Total : 12.49", billingMachine.produceReceipt());
    }
}
