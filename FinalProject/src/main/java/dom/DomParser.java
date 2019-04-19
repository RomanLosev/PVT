package dom;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Users;

public class DomParser {
	public List<Users> parse(Document document) throws FileNotFoundException, XMLStreamException {
		NodeList nodeList = document.getElementsByTagName("User");
		List<Users> users = new ArrayList<Users>();
		for (int i = 0; i < nodeList.getLength(); i++) {
			users.add(getUsers(nodeList.item(i)));
		}
		return users;
	}

	private static Users getUsers(Node node) {
		Users users = new Users();
		Element element = (Element) node;
		users.setEmail(getTagValue("Email", element));
		users.setId(Integer.parseInt(element.getAttribute("id")));

		return users;
	}

	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();
	}
}
