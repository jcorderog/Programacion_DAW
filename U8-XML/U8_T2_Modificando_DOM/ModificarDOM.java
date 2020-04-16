package com.company.Tarea2_Modificacion_DOM;

import org.w3c.dom.*;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ModificarDOM {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("vehiculosXML.xml"));

            Node root = doc.getDocumentElement();

            Text saltoLiena = doc.createTextNode("\n");

            //Añadir Comentarios
            NodeList nl = root.getChildNodes();
            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    Comment comentario = doc.createComment("COMENTARIO AÑADIDO DESDE DOM");
                    Element vehiculo = (Element) nl.item(i);
                    root.insertBefore(comentario,vehiculo);
                    i += 1;
                }
            }

            //Añadior una nueva etiqueta Hija
            Element moto = doc.createElement("moto");
            moto.setAttribute("id","4");

            Element marca = doc.createElement("marca");
            marca.setTextContent("KTM");
            Element color = doc.createElement("color");
            color.setTextContent("Rojo");
            Element potencia = doc.createElement("potencia");
            potencia.setTextContent("150cc");

            moto.appendChild(marca);
            moto.appendChild(color);
            moto.appendChild(potencia);

            //Reemplazar una etiqueta Hija

            Element coche = doc.createElement("coche");
            coche.setAttribute("id","6");

            marca.setTextContent("BMW");
            color.setTextContent("Azul");
            potencia.setTextContent("300cv");

            coche.appendChild(marca);
            coche.appendChild(color);
            coche.appendChild(potencia);

            Element primerVehiculo = (Element) root.getChildNodes().item(2);

            root.replaceChild(coche,primerVehiculo);

            //Volcar t0do en un fichero XML
            TransformerFactory tf = TransformerFactory.newDefaultInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoVehiculos = new File("dom_modificado.xml");
            StreamResult destino = new StreamResult(nuevoVehiculos);

            transformer.transform(origenDOM,destino);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
