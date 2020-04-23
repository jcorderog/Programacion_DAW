package com.company.Tarea2_Modificacion_DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class DomDesdeCero {
    public static void main(String[] args) {
        ArrayList listaVehiculos = new ArrayList();

        listaVehiculos.add(new Vehiculo(TipoVehiculo.COCHE,"BMW",Colores.AZUL,"300cv"));
        listaVehiculos.add(new Vehiculo(TipoVehiculo.COCHE,"Renault",Colores.AMARILLO,"90cv"));
        listaVehiculos.add(new Vehiculo(TipoVehiculo.COCHE,"Mercedes",Colores.GRIS,"250cv"));
        listaVehiculos.add(new Vehiculo(TipoVehiculo.COCHE,"Peugeot",Colores.ROJO,"110cv"));
        listaVehiculos.add(new Vehiculo(TipoVehiculo.COCHE,"Dacia",Colores.GRIS,"60cv"));
        listaVehiculos.add(new Vehiculo(TipoVehiculo.MOTO,"KTM",Colores.ROJO,"200cc"));
        listaVehiculos.add(new Vehiculo(TipoVehiculo.MOTO,"BMW",Colores.GRIS,"250cc"));
        listaVehiculos.add(new Vehiculo(TipoVehiculo.MOTO,"Ducati",Colores.AMARILLO,"300cc"));
        listaVehiculos.add(new Vehiculo(TipoVehiculo.MOTO,"Kawasaki",Colores.AZUL,"300cc"));
        listaVehiculos.add(new Vehiculo(TipoVehiculo.MOTO,"Suzuki",Colores.NARANJA,"100cc"));

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.newDocument();

            Element root = doc.createElement("vehiculos");

            doc.appendChild(root);

            Iterator it = listaVehiculos.iterator();

            int id = 0;

            while (it.hasNext()) {
                Vehiculo v = (Vehiculo) it.next();
                id++;
                Element vehiTag = doc.createElement(v.getTipo().toString());
                vehiTag.setAttribute("id",Integer.toString(id));

                Element marca = doc.createElement("marca");
                marca.setTextContent(v.getMarca());

                Element color = doc.createElement("color");
                color.setTextContent(v.getColor().toString());

                Element potencia = doc.createElement("potencia");
                potencia.setTextContent(v.getPotencia());

                vehiTag.appendChild(marca);
                vehiTag.appendChild(color);
                vehiTag.appendChild(potencia);

                root.appendChild(vehiTag);
            }

            TransformerFactory tf = TransformerFactory.newDefaultInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoVehiculos = new File("cero.xml");
            StreamResult destino = new StreamResult(nuevoVehiculos);

            transformer.transform(origenDOM,destino);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
