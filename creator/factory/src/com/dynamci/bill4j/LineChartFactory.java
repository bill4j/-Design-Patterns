package com.dynamci.bill4j;

/**
 * @author bill-smith liuwb
 * @version v1.0
 */
public class LineChartFactory extends AbstractFactory {

    @Override
    public Chart getCurrentChart() {
        return new LineChart();
    }
}
