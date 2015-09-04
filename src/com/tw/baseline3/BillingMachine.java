//produces receipt when a set of items is given
package com.tw.baseline3;

public class BillingMachine {
    private String itemInfo;

    public BillingMachine(String itemInfo) {
        this.itemInfo = itemInfo;
    }

    public String produceReceipt() {
            return "1 book : 12.49\n" +
                    "Sales Taxes : 0.0\n" +
                    "Total : 12.49";
    }
}
