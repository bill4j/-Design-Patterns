import com.dynamci.bill4j.AbstractFactory;
import com.dynamci.bill4j.Chart;
import com.dynamci.bill4j.util.XmlUtil;

/**
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = (AbstractFactory) XmlUtil.getBean();
        Chart chart =factory.getCurrentChart();
        chart.display();
    }
}
