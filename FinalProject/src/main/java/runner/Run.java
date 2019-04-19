package runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import model.Users;

import dom.DomParser;

import sax.UsersHandler;
import stax.StaxParser;

public class Run {

	private static final String USERS_XML = "users.xml";
	private List<Users> users;

	public Users parse() throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		System.out.println(" ========================= SAX parser ==============================");
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		UsersHandler usersHandler = new UsersHandler();
		saxParser.parse(new File(USERS_XML), usersHandler);
		List<Users> users = usersHandler.getUsers();
		users.forEach(user -> System.out.println(user));

		System.out.println(" ============================== STAX parser =========================");
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(USERS_XML));
		users = new StaxParser().parse(xmlEventReader);
		users.forEach(user -> System.out.println(user));

		System.out.println(" ============================== DOM parser =========================");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(USERS_XML);
		users = new DomParser().parse(document);
		return users.get(0);

	}

	public String getEmail() throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		return parse().getEmail();
	}

}
