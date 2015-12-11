package company.house;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class XmlParser {

	private Document doc;
	
	public XmlParser() {
		
	}
	
	public XmlParser(String fileName){
		try {
			File fXmlFile = new File(fileName);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			this.doc = dBuilder.parse(fXmlFile);
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Document getXMLDoc() {
		return doc;
	}
	
	public NodeList getRootNode() {
		return doc.getChildNodes();
	}
	
	public Node getSpecificNode(String nodeName, NodeList nodes) {
		Node node = null;
		for (int nodeCount = 0; nodeCount < nodes.getLength(); nodeCount++)
		{
			node = nodes.item(nodeCount);
			if (node.getNodeName().equalsIgnoreCase(nodeName)) {
				break;
			} 
		}
		return node;
	}
	
	public String getNodeValue(Node node) {
		String rtnStr = null;
		NodeList childNodes = node.getChildNodes();
		for (int x = 0; x < childNodes.getLength(); x++) {
			Node data = childNodes.item(x);
			if (data.getNodeType() == Node.TEXT_NODE)
			{
				rtnStr = data.getNodeValue();
				break;
			}
		}
		return rtnStr;
	}
	
	public String getNodeValue(String tagName, NodeList nodes) {
		String rtnStr = "";
		for (int x = 0; x < nodes.getLength(); x++) {
			Node node = nodes.item(x);
			if (node.getNodeName().equalsIgnoreCase(tagName))
			{
				NodeList childNodes = node.getChildNodes();
	            for (int y = 0; y < childNodes.getLength(); y++ ) {
	                Node data = childNodes.item(y);
	                if ( data.getNodeType() == Node.TEXT_NODE ) {
	                	rtnStr = data.getNodeValue();
	                }
	    				break;	                	
	            }
			}
		}
		return rtnStr;
	}
	
	public String getNodeAttr(String attrName, Node node){
		NamedNodeMap attrs = node.getAttributes();
		String str = null;
		for (int y = 0; y < attrs.getLength(); y++) {
			Node attr = attrs.item(y);
			if (attr.getNodeName().equalsIgnoreCase(attrName)) {
				str = attr.getNodeValue();
				break;
			}
		}
		return str;
	}

	public String getNodeAttr(String tagName, String attrName, NodeList nodes){
		String str = null;
		for ( int x = 0; x < nodes.getLength(); x++ ) {
	        Node node = nodes.item(x);
	        if (node.getNodeName().equalsIgnoreCase(tagName)) {
	            NodeList childNodes = node.getChildNodes();
	            for (int y = 0; y < childNodes.getLength(); y++ ) {
	                Node data = childNodes.item(y);
	                if ( data.getNodeType() == Node.ATTRIBUTE_NODE ) {
	                    if ( data.getNodeName().equalsIgnoreCase(attrName) ) {
	                        str =  data.getNodeValue();
	                        break;
	                    	
	                    }
	                     
	                }
	            }
	        }
	    }
		return str;
	}
	
	public void setNodeValue(String newValue, String tagName, NodeList nodes){
		Node node = getSpecificNode(tagName, nodes);
		if (node == null){
			
		} else {
			NodeList childNodes = node.getChildNodes();
			for (int y = 0; y < childNodes.getLength(); y++){
				Node data = childNodes.item(y);
				if (data.getNodeType() == Node.TEXT_NODE){
					data.setNodeValue(newValue);
					break;
				}
			}
		}
	}
	
	public void addNade(String tagName, String value, Node parent){
		Document doc = parent.getOwnerDocument();
		
		Node node = doc.createElement(tagName);
		
		Text nodeVal = doc.createTextNode(value);
		Node c = node.appendChild(nodeVal);
		
		parent.appendChild(node);
	}
	
	public void deleteNode(String targetNode, String seedNode, Node parent){
		Document doc = parent.getOwnerDocument();

		Node node = getSpecificNode(seedNode, parent.getChildNodes());
		if (node == null){
			
		} else {
			NodeList childNodes = node.getChildNodes();
			for (int y = 0; y < childNodes.getLength(); y++){
				Node data = childNodes.item(y);
				if( data.getNodeName().equalsIgnoreCase(targetNode)){
					((Node) childNodes).removeChild(data);
					break;
				}
			}
		}
		
	}
	
}
