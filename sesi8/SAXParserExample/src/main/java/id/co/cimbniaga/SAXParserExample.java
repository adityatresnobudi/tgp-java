package id.co.cimbniaga;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.net.URL;

public class SAXParserExample {
    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
                boolean isTitle = false;

                @Override
                public void startElement(String url, String localName, String qName, Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("title")) {
                        isTitle = true;
                    }
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (isTitle) {
                        System.out.println("Title: " + new String(ch, start, length));
                        isTitle = false;
                    }
                }
            };
            URL url = new URL("https://feeds.bbci.co.uk/news/world/rss.xml");
            saxParser.parse(url.openStream(), handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
