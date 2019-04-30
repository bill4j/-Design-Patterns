package com.dynamic.bill4j.histlog;

import com.dynamic.bill4j.AbstractFactory;
import com.dynamic.bill4j.Chart;
import com.dynamic.bill4j.Picture;

/**
 * 3
 * Created by Administrator on 2019/4/30.
 * commpany: 3
 * version:3
 */
public class HistLogFactory implements AbstractFactory {
    @Override
    public Chart getCurrentChart() {
        return new HistLogChart();
    }

    @Override
    public Picture getCurrentPicture() {
        return new HistLogPicture();
    }
}
