package Acceso_a_datos;
import java.io.*;
import java.util.*;

public class flujo_strems_1 {

	public static void main(String[] args)throws IOException  {
		/*Modifica el código anterior para que el programa vaya leyendo caracteres de 20 en 20.*/
			File fichero = new File ("data.txt");  // declaración fichero
			FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero		
			char[] buf = new char[20];
			while ((flu.read(buf))!=-1) {    //Vamos leyendo carácter a carácter
				System.out.println(buf);
				
			}
			flu.close();

	}

}
