package com.dynamci.bill4j;

/**
 * @author bill-smith liuwb
 * @version v1.0
 */
public class LineChart implements Chart {

    public LineChart() {
        System.out.println("com.dynamci.bill4j.LineChart create ……");
    }

    @Override
    public void display() {
        System.out.println("com.dynamci.bill4j.LineChart display");
    }
}
