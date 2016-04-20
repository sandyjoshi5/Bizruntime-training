package com.bizruntime.domparsing;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.File;

public class QueryXmlFileDemo {
	static Logger logger = Logger.getLogger(QueryXmlFileDemo.class);
	public static void main(String argv[]) {
		 
	      try {
	         File inputFile = new File("input.xml");
	         DocumentBuilderFactory dbFactory = 
	            DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         logger.debug("Root element: ");
	         logger.debug(doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("supercars");
	         System.out.println("----------------------------");
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            logger.debug("\nCurrent Element :");
	            logger.debug(nNode.getNodeName());
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               logger.debug("company : ");
	               logger.debug(eElement.getAttribute("company"));
	               NodeList carNameList = 
	                  eElement.getElementsByTagName("carname");
	               for (int count = 0; 
	                  count < carNameList.getLength(); count++) {	 
	                  Node node1 = carNameList.item(count);
	                  if (node1.getNodeType() ==
	                     node1.ELEMENT_NODE) {
	                     Element car = (Element) node1;
	                     logger.debug("car name : ");
	                     logger.debug(car.getTextContent());
	                     logger.debug("car type : ");
	                     logger.debug(car.getAttribute("type"));
	                  }
	               }
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
}
