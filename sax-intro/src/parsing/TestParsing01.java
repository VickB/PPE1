package parsing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class TestParsing01 {

	public static void main(String[] args)throws SAXException, IOException {
		XMLReader parseur = XMLReaderFactory.createXMLReader();
		FileReader lecteur = new FileReader(new File("nouveaux-utilisateurs.xml"));
		parseur.setContentHandler(new ParametrageParsing());
		parseur.parse(new InputSource(lecteur));
		

	}

}
