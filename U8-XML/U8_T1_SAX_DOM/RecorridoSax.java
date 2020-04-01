package com.company.Tarea1_Recorrido_XML_SAX_DOM;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class RecorridoSax {

    public static void main(String[] args) {
        try {
            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();

            DefaultHandler vehiculosSax = new genericXMLsax();

            saxParser.parse(new File("vehiculosXML.xml"),vehiculosSax);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
