package Acceso_a_datos;
import java.io.*;

public class Gestion_ficheros_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir="\\C:\\Users\\Usuario\\Downloads";
		File f=new File(dir);
		String[] archivos=f.list();
		System.out.printf("Fichero en el directorio actual: %d %n", archivos.length);
		for(int i=0; i<archivos.length;i++) {
			File f2= new File(f, archivos[i]);
			System.out.printf("Nombre: %s, es fichero?: %b, es directorio?:%b %n", archivos[i],
				f2.isFile(), f2.isDirectory());
		}
	}

}
