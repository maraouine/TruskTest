package Utils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.MutableCapabilities;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CommonFunctions {
	
	private String DEVICE_NAME = System.getProperty("device");
	/* ATTRIBUTS CONFIGURATION SERVEUR ET WEBDRIVER SET BY parseXML() */
	private Map<String, Object> capabilities = new HashMap<>();


	private String URL 					= null;
	private String LOG_TITLE			= null;
	private String UUID					= null;
	private String APP_ACTIVITY 		= null;
	private String APP_PACKAGE 			= null;
	private String OS_VERSION			= null;

	/* GETTERS*/
	public String getAppPackage() {return APP_PACKAGE;}
	public String getOSVersion() {return OS_VERSION;}
	public String getDeviceName() {return DEVICE_NAME;}
	public Map<String, Object> getCapabilities() {return capabilities;}

	
	/*SETTERS*/
	public void setDeviceName(String deviceName) {
		this.DEVICE_NAME = deviceName;
	}
	
	
	public void parseXML(String deviceName) {
		final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = null;
		Element device = null;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}

		Document doc = null;
		try {
			doc = builder.parse(new File(System.getProperty("user.dir")+"\\devices.xml"));
		} catch (SAXException | IOException e) {
			e.printStackTrace();
		}

		NodeList nodeList = doc.getDocumentElement().getChildNodes();
		org.w3c.dom.Node node = null;
		Element informations = null;
		Element server = null;
		Element capabilities = null;
		for(int i = 0; i<nodeList.getLength(); i++)
		{
			
			if(nodeList.item(i).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
				device = (Element) nodeList.item(i);
				node = nodeList.item(i);
				if(device.getElementsByTagName("nom").item(0).getTextContent().equals(deviceName)) {
					
					NodeList noeuds = node.getChildNodes();
					for(int j =0; j<noeuds.getLength(); j++) {
						if(noeuds.item(j).getNodeName().equals("informations"))
							informations = (Element)noeuds.item(j);
						if(noeuds.item(j).getNodeName().equals("server"))
							server = (Element) noeuds.item(j);
						if(noeuds.item(j).getNodeName().equals("capabilities"))
							capabilities = (Element)noeuds.item(j);
					}
					break;
				}
			}
		}

		OS_VERSION = informations.getElementsByTagName("version").item(0).getTextContent();
		APP_ACTIVITY = informations.getElementsByTagName("appActivity").item(0).getTextContent();
		APP_PACKAGE = informations.getElementsByTagName("appPackage").item(0).getTextContent();
		UUID = informations.getElementsByTagName("udid").item(0).getTextContent();


		NodeList listCapabilities = ((org.w3c.dom.Node) capabilities).getChildNodes();

		for(int i = 0; i<listCapabilities.getLength(); i++) {
			if(listCapabilities.item(i).getNodeType() == Node.ELEMENT_NODE) {
				this.capabilities.put(listCapabilities.item(i).getNodeName(), listCapabilities.item(i).getTextContent());
				
			}
		}
	}
}
