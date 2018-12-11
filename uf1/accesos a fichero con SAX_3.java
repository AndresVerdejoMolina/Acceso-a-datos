import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class acceso_sax {
/*Crea un programa que lea el archivo “discoteca.xml” (adjunto en el moodle) y 
determine el número de discos listados en el archivo. AYUDA: contabilizando 
el número de títulos.*/

	public static void main(String[] args)	throws FileNotFoundException, IOException, SAXException {
		/* A continuación se crea objeto procesador XML - XMLReader -. Durante la creación de este objeto se puede producir una
		excepción SAXException. */
			XMLReader procesadorXML = XMLReaderFactory.createXMLReader();
		/* A continuación, mediante setContentHandler establecemos que la clase que gestiona los eventos provocados por la
		lectura del XML será GestionContenido */
			GestionContenido gestor = new GestionContenido();
			procesadorXML.setContentHandler(gestor);
		/* Por último, se define el fichero que se va leer mediante InputSource y se procesa el documento XML mediante el
		método parse() de XMLReader */
			InputSource fileXML = new InputSource ("C:\\Users\\Usuario\\Desktop\\DAM2\\discoteca.xml");
			procesadorXML.parse(fileXML);
			}
	}
class GestionContenido extends DefaultHandler {
		int contador = 0;
		//inicializando variable "contador"
		public GestionContenido() {
			super();
		}
		public void endDocument(){
		//imprimiendo variable contador cuando llegue al final del fichero
			System.out.println(contador);
		}
		public void startElement (String uri, String nombre, String nombreC, Attributes atts) {
		//informacion de la etiqueta de incio del elemento
			if(nombre.equals("TITLE")) {
			//en caso de que el "nombre" se ha igual a "TITLE", entonces encontramos un disco y sumamos contador
				contador++;
			}
		}
}
