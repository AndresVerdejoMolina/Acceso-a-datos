package Acceso_a_datos;
import java.io.*;

public class flujo_strems_2 {

	public static void main(String[] args) throws IOException {
		/*Modifica el ejemplo anterior para, en vez de escribir los caracteres uno a uno, escribir todo el array usando el método write (char [] buf)*/
		// TODO Auto-generated method stub
		File fichero = new File("C:\\Users\\Usuario\\Desktop\\prueba.txt");
		FileWriter fic = new FileWriter (fichero);
		String cadena = " Esto es una prueba con FileWriter";
		char [] cad = cadena.toCharArray () ;
		fic.write (cad); // se va escribiendo carácter a carácter
		fic.append ('*'); // añadimos un asterisco al final
		fic.close ();   // cerramos fichero

	}

}


