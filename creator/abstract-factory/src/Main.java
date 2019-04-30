import com.dynamic.bill4j.AbstractFactory;
import com.dynamic.bill4j.Chart;
import com.dynamic.bill4j.Picture;
import com.dynamic.bill4j.util.XmlUtil;

/**
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = (AbstractFactory) XmlUtil.getBean();
        Chart chart = factory.getCurrentChart();
        Picture picture = factory.getCurrentPicture();
        chart.display();
        picture.drawPicture();
    }
}
