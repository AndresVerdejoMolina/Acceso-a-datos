package Acceso_a_datos;
import java.io.*;

public class Gestion_ficheros_ej6 {

	public static void main(String[] args) {
		File d=new File("NuevoDir");
		//Directorio guardado en "d"
		File f1= new File(d,"Fichero1.txt");
		//Guardadndo fichero "Fichero1.txt" con la direccion de "d" en "f1"
		File f2= new File (d,"Fichero2.txt");
		//Guardadndo fichero "Fichero2.txt" con la direccion de "d" en "f2"
		d.mkdir();
		//Creando fichero "f1" y "f2"
		try {
			if (f1.createNewFile())
				//En caso de que el fichero "f1" se crea, devolverá true y entrará aqui
				System.out.println("Fichero1 creado correctamente");
			else
				//En caso de que el fichero "f1" no se haya creado, devolverá false y entrará aqui
				System.out.println("No se ha podido crear Fichero1");
			if (f2.createNewFile())
				//En caso de que el fichero "f2" se crea, devolverá true y entrará aqui
				System.out.println("Fichero2 creado correctamente");
			else
				//En caso de que el fichero "f1" no se haya creado, devolverá false y entrará aqui
				System.out.println("No se ha podido crear Fichero2");
		} 
		catch (IOException ioe) {
			//En caso de que no se encuentre el fichero
			ioe.printStackTrace();
		}
		f1.renameTo( new File(d,"Fichero1Nuevo"));
		//renombrando fichero "f1"
		try {
			File f3 = new File (d ,"Fichero3.txt");
			f3.createNewFile();
			//devolverá true si el archivo nombrado no existe y se creó correctamente; falso si el archivo nombrado ya existe
			
		}
		catch (IOException ioe1) {
			//En caso de que no se encuentre el fichero
			ioe1.printStackTrace();
		}

		File directory = new File("NuevoDir");
		File[] files = directory.listFiles();
		//Creando una lista de todos los archvis del directorio "directory"
		
		for (File file: files) {
			//Recorriendo fichero a fichero
			if (!file.delete()) {
				//verdadero si el archivo o directorio se elimina exitosamente; falso de lo contrario
				System.out.println("Failed to delete "+file);
			}
		}
		directory.delete();
		//borrando directorio
}
}
