package dto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Personnes {

	static Element racine = new Element("personnes");

	static Document document = new Document(racine);

	public static void main(String[] args) {
		Element etudiant = new Element("etudiant");
		racine.addContent(etudiant);

		Attribute classe = new Attribute("classe", "P2");
		etudiant.setAttribute(classe);

		Element nom = new Element("nom");
		nom.setText("ToTo");
		etudiant.addContent(nom);

		save("personnes.xml");
	}

	

	private static void save(String file) {
		XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
		try {
			out.output(document, new FileOutputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
