package Acceso_a_datos;
import java.io.*;

public class Gestion_ficheros_ej6 {

	public static void main(String[] args) {
		File d=new File("NuevoDir");
		File f1= new File(d,"Fichero1.txt");
		File f2= new File (d,"Fichero2.txt");
		d.mkdir();
		try {
			if (f1.createNewFile())
				System.out.println("Fichero1 creado correctamente");
			else
				System.out.println("No se ha podido crear Fichero1");
			if (f2.createNewFile())
				System.out.println("Fichero2 creado correctamente");
			else
				System.out.println("No se ha podido crear Fichero2");
		} 
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		f1.renameTo( new File(d,"Fichero1Nuevo"));
		try {
			File f3 = new File ("NuevoDir/Fichero3.txt");
			f3.createNewFile();
		}
		catch (IOException ioe1) {
			ioe1.printStackTrace();
		}

		File directory = new File("NuevoDir");
		File[] files = directory.listFiles();
		
		for (File file: files) {
			if (!file.delete()) {
				System.out.println("Failed to delete "+file);
			}
		}
		directory.delete();
}
}
