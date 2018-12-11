package Acceso_a_datos;

import java.io.*;

public class fichero_binarios_1 {

	public static void main(String[] args) throws IOException {
		//Ejercicio 1
		System.out.println("Averigua jerárquicamente, ¿cuál es la relación entre DataInputStream FileInputStream?");
		System.out.println("DataInputStream hereda de FileInputStream");
		
		/*Ejercicio 2
		Escribe un programa que inserte datos en “FicherosDatos.dat”. Los datos los tomará de dos arrays definidos en el propio programa. Uno contendrá los nombres de una serie de personas y el otro sus edades. Se irá recorriendo los arrays e iremos escribiendo en el fichero el nombre (mediante el método writeUTF(String str) y la edad (writeInt (int v)).
		NOTA: si queremos añadir bytes al final del fichero (FicheroDatos.dat) se puede usar el siguiente constructor: FileOutputStream fileout = new FileOutputStream (fichero, true)*/
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
