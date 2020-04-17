package com.company.Tarea3_Uso_de_Stax;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.events.*;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class CrearStaxCero {
    public static void main(String[] args) {
        ArrayList vehiculos = new ArrayList();

        vehiculos.add(new Vehiculo(1,TipoVehiculo.COCHE,"BMW",Colores.AZUL,"300cv"));
        vehiculos.add(new Vehiculo(2,TipoVehiculo.COCHE,"Renault",Colores.AMARILLO,"90cv"));
        vehiculos.add(new Vehiculo(3,TipoVehiculo.COCHE,"Mercedes",Colores.GRIS,"250cv"));
        vehiculos.add(new Vehiculo(4,TipoVehiculo.COCHE,"Peugeot",Colores.ROJO,"110cv"));
        vehiculos.add(new Vehiculo(5,TipoVehiculo.COCHE,"Dacia",Colores.GRIS,"60cv"));
        vehiculos.add(new Vehiculo(1,TipoVehiculo.MOTO,"KTM",Colores.ROJO,"200cc"));
        vehiculos.add(new Vehiculo(2,TipoVehiculo.MOTO,"BMW",Colores.GRIS,"250cc"));
        vehiculos.add(new Vehiculo(3,TipoVehiculo.MOTO,"Ducati",Colores.AMARILLO,"300cc"));
        vehiculos.add(new Vehiculo(4,TipoVehiculo.MOTO,"Kawasaki",Colores.AZUL,"300cc"));
        vehiculos.add(new Vehiculo(5,TipoVehiculo.MOTO,"Suzuki",Colores.NARANJA,"100cc"));

        try {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("stax.xml"));

            XMLEventFactory eventFactory = XMLEventFactory.newInstance();

            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);

            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");

            xmlWriter.add(saltoDeLinea);

            StartElement vehiculoStartElement = eventFactory.createStartElement("","","vehiculos");
            xmlWriter.add(vehiculoStartElement);
            xmlWriter.add(saltoDeLineaTab);

            int longitud = 0;

            for (Object ve : vehiculos) {
                Vehiculo v = (Vehiculo) ve;
                StartElement vehiculoStart = eventFactory.createStartElement("","",v.getTipo().toString());
                StartElement marcaStart = eventFactory.createStartElement("","","marca");
                StartElement colorStart = eventFactory.createStartElement("","","color");
                StartElement potenciaStart = eventFactory.createStartElement("","","potencia");

                Attribute id = eventFactory.createAttribute("id",Integer.toString(v.getId()));

                EndElement vehiculoEnd = eventFactory.createEndElement("","",v.getTipo().toString());
                EndElement marcaEnd = eventFactory.createEndElement("","","marca");
                EndElement colorEnd = eventFactory.createEndElement("","","color");
                EndElement potenciaEnd = eventFactory.createEndElement("","","potencia");

                Characters marca = eventFactory.createCharacters(v.getMarca());
                Characters color = eventFactory.createCharacters(v.getColor().toString());
                Characters potencia = eventFactory.createCharacters(v.getPotencia());

                xmlWriter.add(vehiculoStart);
                xmlWriter.add(id);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(marcaStart);
                xmlWriter.add(marca);
                xmlWriter.add(marcaEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(colorStart);
                xmlWriter.add(color);
                xmlWriter.add(colorEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(potenciaStart);
                xmlWriter.add(potencia);
                xmlWriter.add(potenciaEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(vehiculoEnd);

                if (longitud == vehiculos.size()-1) {
                    xmlWriter.add(saltoDeLinea);
                } else {
                    xmlWriter.add(saltoDeLineaTab);
                }
                longitud++;

            }

            EndElement vehiculosEndElement = eventFactory.createEndElement("","","vehiculos");
            xmlWriter.add(vehiculosEndElement);
            xmlWriter.add(saltoDeLinea);

            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}