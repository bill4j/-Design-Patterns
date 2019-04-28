package com.dynamci.bill4j;

/**
 * @author bill-smith liuwb
 * @version v1.0
 */
public class PeiChart implements Chart {
    public PeiChart() {
        System.out.println("com.dynamci.bill4j.PeiChart create !");
    }

    @Override
    public void display() {
        System.out.println("com.dynamci.bill4j.PeiChart display");
    }
}
