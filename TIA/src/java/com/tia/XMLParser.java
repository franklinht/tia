/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class XMLParser {


    public static void writeNotasXML() throws FileNotFoundException, IOException {
        Document d = new Document();
        Element root = new Element("document");
        root.setAttribute("disciplina0", "Calculo");
        root.setAttribute("nota0", "6");
        root.setAttribute("disciplina1", "Fisica");
        root.setAttribute("nota1", "9");
        root.setAttribute("disciplina2", "Etica");
        root.setAttribute("nota2", "4");
        root.setAttribute("disciplina3", "Logica de programacao");
        root.setAttribute("nota3", "8");
        d.setRootElement(root);

        XMLOutputter xmlout = new XMLOutputter();
        xmlout.output(d, new FileOutputStream(new File("notas.xml")));
    }

    public static Document leNotasXML() throws FileNotFoundException, IOException, JDOMException {
        SAXBuilder sb = new SAXBuilder();
//Este documento agora possui toda a estrutura do arquivo.
        Document d = sb.build(new File("notas.xml"));
        return d;
    }

    //Para Faltas
    public static void writeFaltasXML() throws FileNotFoundException, IOException {
        Document d = new Document();
        Element root = new Element("document");
        root.setAttribute("faltas", "9");
        d.setRootElement(root);

        XMLOutputter xmlout = new XMLOutputter();
        xmlout.output(d, new FileOutputStream(new File("faltas.xml")));
    }

    public static Document leFaltasXML() throws FileNotFoundException, IOException, JDOMException {
        SAXBuilder sb = new SAXBuilder();
//Este documento agora possui toda a estrutura do arquivo.
        Document d = sb.build(new File("faltas.xml"));
        return d;

    }
}