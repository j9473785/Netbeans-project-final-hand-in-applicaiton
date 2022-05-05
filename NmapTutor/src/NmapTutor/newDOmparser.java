/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NmapTutor;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


/**
 *
 * @author work
 */
public class newDOmparser {
    
    
    private static final String FILENAME = "C:\\Users\\work\\Documents\\NetBeansProjects\\NmapTutor\\src\\NmapTutor\\NMAP.xml";
    
    public static void main(String[] args) {
        
        
          DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
          try {
              
              DocumentBuilder db = dbf.newDocumentBuilder();
              Document doc = db.parse(new File(FILENAME));
              doc.getDocumentElement().normalize();
              System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
          System.out.println("------");
          //get the port id from the xml file 
          NodeList list = doc.getElementsByTagName("port");
          for (int temp = 0; temp < list.getLength(); temp++) {
              
              Node node = list.item(temp);
               if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                  
                       String id = element.getAttribute("scaninfo");
                      // this code is getting the tags within the extraports and printing it out in the terminal//
                      String protocol = element.getElementsByTagName("protocol").item(0).getTextContent();
                       String portused = element.getElementsByTagName("portused").item(0).getTextContent();
                       String services = element.getElementsByTagName("services").item(0).getTextContent();
                       System.out.println("port portused : " + portused);
                       System.out.println("port protocol : " + protocol);
                       System.out.println("services : " + services);
                       
                      
               }
          }
          } catch (ParserConfigurationException | SAXException | IOException e) {
          e.printStackTrace();
    }
    }
    }

