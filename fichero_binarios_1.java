package Acceso_a_datos;

import java.io.*;

public class fichero_binarios_1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Averigua jerárquicamente, ¿cuál es la relación entre DataInputStream FileInputStream?");
		System.out.println("DataInputStream hereda de FileInputStream");
		
		DataOutputStream dataOS = new DataOutputStream (new FileOutputStream(new File("C:\\Users\\Usuario\\Desktop\\prueba.txt")));

		String [] Nombre= new String[5];
		Nombre[0]="Lucas";
		Nombre[1]="Federico";
		Nombre[2]="Laura";
		Nombre[3]="Pepe";
		Nombre[4]="Dolores";
		
		int [] Edades = new int[5];
		Edades[0]=13;
		Edades[1]=34;
		Edades[2]=18;
		Edades[3]=9;
		Edades[4]=21;
		
		for (int i = 0; i < 5; i++) {
			dataOS.writeUTF(Nombre[i]);
			dataOS.writeInt(Edades[i]);
		}
		dataOS.close();

	}

}
