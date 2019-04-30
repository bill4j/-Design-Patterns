package com.dynamic.bill4j.line;

import com.dynamic.bill4j.AbstractFactory;
import com.dynamic.bill4j.Chart;
import com.dynamic.bill4j.Picture;

/**
 * @author bill-smith liuwb
 * @version v1.0
 */
public class LineFactory implements AbstractFactory {

    @Override
    public Chart getCurrentChart() {
        return new LineChart();
    }

    @Override
    public Picture getCurrentPicture() {
        return new LinePicture();
    }
}
