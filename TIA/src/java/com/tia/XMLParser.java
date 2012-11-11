/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tia;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class XMLParser {

    public static void lerXML(File f) throws JDOMException, IOException {
//Aqui você informa o nome do arquivo XML.
        
//Criamos uma classe SAXBuilder que vai processar o XML
        SAXBuilder sb = new SAXBuilder();
//Este documento agora possui toda a estrutura do arquivo.
        Document d = sb.build(f);
//Recuperamos o elemento root
        Element blog = d.getRootElement();
//Recuperamos os elementos filhos (children)
        List elements = blog.getChildren();
        Iterator i = elements.iterator();
    }
}