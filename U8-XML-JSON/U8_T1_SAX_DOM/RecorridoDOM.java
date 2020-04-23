package com.company.Tarea1_Recorrido_XML_SAX_DOM;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class RecorridoDOM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------\n 1: \n----------");
        numNodosHijos();

        System.out.println("----------\n 2: \n----------");
        mostrarXMLDom();

        System.out.println("----------\n 3: \n----------");

        System.out.println("Introduce el nombre de una etiqueta: ");
        String eti = sc.nextLine();
        Element elementoEti = null;

        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = (Document) db.parse(new File("vehiculosXML.xml"));

            elementoEti = doc.createElement(eti);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        mostrarContenidoEtiqueta(elementoEti);

    }

    public static void numNodosHijos (){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("vehiculosXML.xml"));

            Element root = doc.getDocumentElement();

            System.out.println("Cantidad de nodos Hijos del elemento Raiz: "+root.getChildNodes().getLength());

            NodeList nl = root.getChildNodes();

            System.out.println("Información de los nodos: ");
            for (int i = 0; i < nl.getLength(); i++) {
                System.out.println("Nodo: "+i);
                System.out.println("Tipo de nodo: "+nl.item(i).getNodeType());
                System.out.println("---------------------------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mostrarXMLDom() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("vehiculosXML.xml"));

            Element root = doc.getDocumentElement();

            NodeList nl = root.getChildNodes();

            System.out.println("Información de los nodos: \n");

            for (int i = 0; i < nl.getLength(); i++) {
                System.out.println("Nodo: "+i+" Nombre: "+nl.item(i).getNodeName());
                System.out.println("Tipo de nodo: "+nl.item(i).getNodeType());
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE){
                    System.out.println("Contenido: "+nl.item(i).getTextContent());
                }
                System.out.println("---------------------------------------------");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mostrarContenidoEtiqueta(Element e) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("vehiculosXML.xml"));

            NodeList nl = doc.getElementsByTagName(e.getTagName());

            if (nl.getLength() == 0){
                System.out.println("No hay ninguna ocurrencia de esa etiqueta");
            } else {
                for (int i = 0; i < nl.getLength(); i++) {
                    Node nodo = nl.item(i);

                    Element elNode = (Element) nl.item(i);
                    System.out.println("Nombre: "+elNode.getTagName()+" ID: "+elNode.getAttribute("id"));

                    if (nodo.hasChildNodes()) {
                        System.out.println("    Etiquetas hijas:");
                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j < listaInterior.getLength(); j++) {
                            if(listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element eHijo = (Element) listaInterior.item(j);
                                System.out.println("        "+eHijo.getTagName()+": "+eHijo.getTextContent());
                            }
                        }
                    } else {
                        System.out.println("No tiene ninguna etiqueta hija");
                    }
                    System.out.println("-----------------------------------------------");
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
