package sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import model.Users;

public class UsersHandler extends DefaultHandler {
	private List<Users> users;
	private Users user;
	boolean bEmail = false;

	public List<Users> getUsers() {
		return users;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("User")) {
			String id = attributes.getValue("id");
			user = new Users();
			user.setId(Integer.parseInt(id));
			if (users == null) {
				users = new ArrayList<>();
			}
		} else if (qName.equalsIgnoreCase("Email")) {
			bEmail = true;
		}

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("User")) {
			users.add(user);
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {

		if (bEmail) {
			user.setEmail(new String(ch, start, length));
			bEmail = false;
		}

	}
}
