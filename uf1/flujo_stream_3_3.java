package Acceso_a_datos;
import java.io.*;

public class flujo_strems_3 {

	public static void main(String[] args)throws IOException {
		/*Repite el ejercicio anterior pero ahora utilizando la clase PrintWriter*/
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Usuario\\Desktop\\prueba.txt"));
		//Con PrintWritter, en una linea declaramos que vamos a escribir en ese archivo		 
		for (int i = 0; i < 10; i++) {			
			pw.println("informatica");
			//Escribimos 10 veces "informatica"
		}
	 
		pw.close();
	}
}
