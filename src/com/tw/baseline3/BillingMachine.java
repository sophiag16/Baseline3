//produces receipt when a set of items is given
package com.tw.baseline3;

public class BillingMachine {
    private String itemInfo;

    public BillingMachine(String itemInfo) {
        this.itemInfo = itemInfo;
    }

    public String produceReceipt() {
        String[] splitItemInfo = itemInfo.split(" ");
        int length = splitItemInfo.length;
        double shelfPrice = Double.parseDouble(splitItemInfo[length - 1]);
        String receipt = "";

        for(int i = 0; i < length - 2; i++) {
            receipt += splitItemInfo[i] + " ";
        }

        receipt += ": " + Double.toString(shelfPrice);
        receipt += "\nSales Taxes : 0.0" + "\nTotal : " + Double.toString(shelfPrice);
        return receipt;
    }
}
