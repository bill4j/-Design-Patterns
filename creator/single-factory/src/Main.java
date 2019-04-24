import com.dynamci.bill4j.Chart;
import com.dynamci.bill4j.util.XmlUtil;

/**
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        ChartFactory chartFactory = new ChartFactory();
        String chartType = XmlUtil.getChartType();
        Chart chart = chartFactory.getChart(chartType);
        chart.display();
    }
}
