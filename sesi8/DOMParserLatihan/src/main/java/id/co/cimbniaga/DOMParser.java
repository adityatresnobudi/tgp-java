package id.co.cimbniaga;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;

public class DOMParser {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            URL url = new URL("https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml");
            Document document = builder.parse(url.openStream());
//            System.out.println(document);

            document.getDocumentElement().normalize();
//            System.out.println(document);
            NodeList nodeList = document.getElementsByTagName("Cube");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);

                if (!element.hasAttribute("currency")) {
                    continue;
                }
                System.out.println("Currency: " + element.getAttribute("currency") + ", Rate: " + element.getAttribute("rate"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
