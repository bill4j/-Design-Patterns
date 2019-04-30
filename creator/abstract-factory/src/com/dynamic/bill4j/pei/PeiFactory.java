package com.dynamic.bill4j.pei;

import com.dynamic.bill4j.AbstractFactory;
import com.dynamic.bill4j.Chart;
import com.dynamic.bill4j.Picture;

/**
 * @author bill-smith liuwb
 * @Package com.dynamci.bill4j
 * @Date 2019/4/28 14:34
 * @Version v1.0
 * @Copyright @ 2019-2020用友网络科技股份有限公司
 * @Email 18232480449@163.com
 * @Contract https://github.com/BillCindy
 * @Blog https://blog.csdn.net/t131452n?viewmode=contents
 */
public class PeiFactory implements AbstractFactory {
    @Override
    public Chart getCurrentChart() {
        return new PeiChart();
    }

    @Override
    public Picture getCurrentPicture() {
        return new  PeiPicture();
    }
}
