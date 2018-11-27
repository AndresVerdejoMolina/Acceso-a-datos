package Acceso_a_datos;
import java.io.*;
import java.util.*;

public class flujo_strems_1 {

	public static void main(String[] args)throws IOException  {
			System.out.println("introuduce la ruta");
			Scanner leer= new Scanner(System.in);
			String input= leer.nextLine();
			File fichero = new File (input);  // declaración fichero
			FileReader flu = new FileReader (fichero); // creamos flujo de entrada hacia el fichero		
			char[] buf = new char[20];
			while ((flu.read(buf))!=-1) {    //Vamos leyendo carácter a carácter
				System.out.println(buf);
				
			}
			flu.close();

	}

}
