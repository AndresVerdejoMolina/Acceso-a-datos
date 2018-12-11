package Acceso_a_datos;
import java.util.*;

import java.io.File;

public class Gestion_ficheros_ej2 {

	public static void main(String[] args) {
		File f=new File (args[0]);
		//Recogiendo ruta atraves de args, y lo guardamos en la variable "f" de tipo archivo
		  for (String s: args) {
			  //Recorriendo todos los archivos del directorio
			  f = new File(s);
			 paths = f.listFiles();
			 for(File path:paths) {
			    System.out.println(path);
				//Imprimiendo ficheros
			 }
		  }
	 }
}
