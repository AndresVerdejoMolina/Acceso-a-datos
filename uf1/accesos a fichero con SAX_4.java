import java.io.*;
import java.util.Scanner;

import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class acceso_sax_4 {
/*Crea un programa que devuelva el número de discos registrados en 
“discoteca.xml” de un determinado autor que le pasamos por consola. Si el 
autor carece de discos en el archivo, el programa devolverá un mensaje del 
estilo: “El autor <xxxxxx> no aparece en el archivo.*/

		public static void main(String[] args)	throws FileNotFoundException, IOException, SAXException {
		/* A continuación se crea objeto procesador XML - XMLReader -. Durante la creación de este objeto se puede producir una
		excepción SAXException. */
				XMLReader procesadorXML = XMLReaderFactory.createXMLReader();
				System.out.println("Introduce un artista:");
				Scanner primero= new Scanner(System.in);
				String artista=primero.nextLine();
				//Obteniendo nombre del artista
				/* A continuación, mediante setContentHandler establecemos que la clase que gestiona los eventos provocados por la
			lectura del XML será GestionContenido */
				GestionContenido gestor = new GestionContenido(artista);
				//inicializando variable "gestor" de tipo GestionContenido
				procesadorXML.setContentHandler(gestor);
				/* Por último, se define el fichero que se va leer mediante InputSource y se procesa el documento XML mediante el
		método parse() de XMLReader */
				InputSource fileXML = new InputSource ("C:\\Users\\Usuario\\Desktop\\DAM2\\discoteca.xml");
				procesadorXML.parse(fileXML);
				}
		}
	class GestionContenido extends DefaultHandler {
			int contador = 0;
			String artista = "";
			public GestionContenido(String Artista) {
				super();
				this.artista=Artista;				
			}
			public void endDocument(){
				System.out.println("Hay :" + contador + " artistas");
			}
			public void characters(char[] ch, int inicio, int longitud) throws SAXException {
				String car = new String (ch, inicio, longitud);
				//Guardar informacion de cada etiqueta en "car"
				if(car.equals(artista)) {
					//En el caso de que la variable "car" se ha igual al artista introducido, se sumará 1 en la variable contador
					contador++;
				}else{
					//Si no se encuentra, imprimira esta mensaje con el artista no hayado
					System.out.println("No se ha encontrado el artista: " + artista);
			}
	}
