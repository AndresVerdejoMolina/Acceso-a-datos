package Acceso_a_datos;
import java.io.File;

public class Gestion_ficheros_ej3_ej4 {
	/*Añade al programa anterior las instrucciones necesarias para que envíe un mensaje de error en caso de que el directorio pasado como argumento no 
exista.
*/

	public static void main(String[] args) {
		//Archivo entrado como argumento
		File a=null;
		File[] paths;
		//Creando una array de tipo fichero
		try {
			for (String s: args) {
				a= new File(s);
				paths = a.listFiles();
				//Mostrar todos los archivos del directorio y guardarlos en "paths"
				for(File path:paths) {
					System.out.println(path);
					//listar ficheros					
				}
			}
		}catch(NullPointerException e) {
			//Controlar en caso de que no exista el directorio
			System.out.println("No existe");
		}

	}

}
