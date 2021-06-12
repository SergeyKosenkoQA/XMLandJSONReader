package rough;

import org.dom4j.DocumentException;
import utils.XMLReader;

public class TestXML {
    public static void main(String[] args) throws DocumentException {

        XMLReader xml = new XMLReader(System.getProperty("user.dir") + "/src/main/resources/locators/OR.xml");
        System.out.println(xml.getLocator("homepage.username.xpath"));
    }
}
