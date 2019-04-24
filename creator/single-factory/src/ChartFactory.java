import com.dynamci.bill4j.Chart;
import com.dynamci.bill4j.HistLogChart;
import com.dynamci.bill4j.LineChart;
import com.dynamci.bill4j.PeiChart;

/**
 * @author bill-smith liuwb
 * @version v1.0
 */
class ChartFactory {
    private static final String LINE_CHART = "com.dynamci.bill4j.LineChart";
    private static final String PEI_CHART = "com.dynamci.bill4j.PeiChart";
    private static final String LOG_CHART = "com.dynamci.bill4j.HistLogChart";
    private Chart chart;

    Chart getChart(String chartType) {
        if (chartType != null) {
            if (LINE_CHART.equals(chartType)) {
                chart = new LineChart();
            }
            if (PEI_CHART.equals(chartType)) {
                chart = new PeiChart();
            }
            if (LOG_CHART.equals(chartType)) {
                chart = new HistLogChart();
            }
        }
        return chart;

    }
}
