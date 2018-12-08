package Acceso_a_datos;
import java.io.*;

public class Gestion_ficheros_ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dir="\\C:\\Users\\Usuario\\Downloads";
		//Direccion del directorio
		File f=new File(dir);
		String[] archivos=f.list();
		System.out.printf("Fichero en el directorio actual: %d %n", archivos.length);
		//Numero de objetos que compone el directorio
		for(int i=0; i<archivos.length;i++) {
			//Recorriendo fichero a fichero
			File f2= new File(f, archivos[i]);
			System.out.printf("Nombre: %s, es fichero?: %b, es directorio?:%b %n", archivos[i],
				f2.isFile(), f2.isDirectory());
			/*Imprimiendo datos de cada archivos: 
			nombre del fichero/directorio, en caso de que sea un fichero devolverá true, en caso de que sea un directorio devolverá true
			*/
		}
	}

}
