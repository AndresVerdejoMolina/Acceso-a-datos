package Acceso_a_datos;

import java.io.*;

public class fichero_binarios_1_3 {

	public static void main(String[] args) throws IOException {
		DataInputStream dataOS = new DataInputStream (new FileInputStream(new File("C:\\Users\\Usuario\\Desktop\\prueba.txt")));
		
		try {
			while(true) {
				System.out.println("Nombre " + dataOS.readUTF() + " Tiene " + dataOS.readInt() + " años.");
			}
		}catch (EOFException e) {
			System.out.println("Ya esta!");
		}

	}

}
