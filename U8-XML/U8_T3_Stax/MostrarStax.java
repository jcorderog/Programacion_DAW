package com.company.Tarea3_Uso_de_Stax;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.*;
import java.io.FileInputStream;

public class MostrarStax {
    public static void main(String[] args) {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("vehiculosXML.xml"));

            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartDocument()) {
                    System.out.println("Comienzo del parseado del documento.");
                } else if (xmlEvent.isEndDocument()) {
                    System.out.println("Fin del parseado del documento.");
                } else if (xmlEvent.isStartElement()) {
                    StartElement startTag = xmlEvent.asStartElement();


                    String tagName = startTag.getName().getLocalPart();
                    if (tagName == "vehiculos") {
                        System.out.println("<"+startTag.getName().getLocalPart()+">");
                    } else if (tagName == "coche" || tagName == "moto") {
                        Attribute id = startTag.getAttributeByName(new QName("id"));
                        System.out.println("    <"+startTag.getName().getLocalPart()+" "+id.getName()+"=\""+id.getValue()+"\">");
                    } else {
                        System.out.print("        <"+startTag.getName().getLocalPart()+">");
                    }

                } else if (xmlEvent.isEndElement()) {
                    EndElement endTag = xmlEvent.asEndElement();
                    String tagName = endTag.getName().getLocalPart();
                    if (tagName == "vehiculos") {
                        System.out.println("<\\"+endTag.getName().getLocalPart()+">");
                    } else if (tagName == "coche" || tagName == "moto") {
                        System.out.println("    <\\"+endTag.getName().getLocalPart()+">");
                    } else {
                        System.out.println("<\\"+endTag.getName().getLocalPart()+">");
                    }
                } else if (xmlEvent.isCharacters()) {
                    Characters texto = xmlEvent.asCharacters();

                    if (!texto.getData().contains("\n")) {
                        System.out.print(texto.getData());
                    }
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}