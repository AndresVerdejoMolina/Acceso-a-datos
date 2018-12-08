package Acceso_a_datos;

import java.io.*;

public class fichero_binarios_1 {

	public static void main(String[] args) throws IOException {
		//Ejercicio 1
		System.out.println("Averigua jerárquicamente, ¿cuál es la relación entre DataInputStream FileInputStream?");
		System.out.println("DataInputStream hereda de FileInputStream");
		
		//Ejercicio 2
		DataOutputStream dataOS = new DataOutputStream (new FileOutputStream(new File("C:\\Users\\Usuario\\Desktop\\prueba.txt")));
		//guardando fichero en dataOS con DataOuroutStream para leer datos primitivos

		String [] Nombre= new String[5];
		Nombre[0]="Lucas";
		Nombre[1]="Federico";
		Nombre[2]="Laura";
		Nombre[3]="Pepe";
		Nombre[4]="Dolores";
		//creando arrrays con los nombres
		
		int [] Edades = new int[5];
		Edades[0]=13;
		Edades[1]=34;
		Edades[2]=18;
		Edades[3]=9;
		Edades[4]=21;
		//creando arrays con las edades
		
		for (int i = 0; i < 5; i++) {
			dataOS.writeUTF(Nombre[i]);
			//insetando de 1 a 1, cada nombre
			dataOS.writeInt(Edades[i]);
			//insetando de 1 a 1, cada edad
		}
		dataOS.close();
	}

}
