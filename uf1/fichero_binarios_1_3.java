package Acceso_a_datos;

import java.io.*;

public class fichero_binarios_1_3 {

	public static void main(String[] args) throws IOException {
		/*Ahora escribe un programa que permita visualizar los datos grabados anteriormente en el fichero FicheroDatos.dat.
		Se deben obtener en el mismo orden en el que se escribieron, es decir, primero obtenemos el nombre y luego la edad.*/
		DataInputStream dataOS = new DataInputStream (new FileInputStream(new File("C:\\Users\\Usuario\\Desktop\\prueba.txt")));
		//guardamos el fichero en "dataOS"
		
		try {
			while(true) {
				//bucle True, para que lea todo el archivo
				System.out.println("Nombre " + dataOS.readUTF() + " Tiene " + dataOS.readInt() + " años.");
				//Imprimiendo datos, para leer los Strings utilizamos readUTF, para leer los Int utilizamos el readInt
			}
		}catch (EOFException e) {
			System.out.println("Ya esta!");
		} finally {
			file.close();
		}

	}

}
