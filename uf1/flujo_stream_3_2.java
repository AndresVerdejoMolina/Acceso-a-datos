package Acceso_a_datos;
import java.io.*;

public class flujo_strems_3 {

	public static void main(String[] args)throws IOException {
		/*Escribe un programa en java que muestre por pantalla un fichero de texto que le pasamos como argumento (o utilizando scanner) utilizando la clase BufferedReader*/
		File fout = new File("C:\\Users\\Usuario\\Desktop\\prueba.txt");
		FileOutputStream fos = new FileOutputStream(fout);	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		//Guardamos la direccion del fichero en un BufferedWritter
	 
		for (int i = 0; i < 10; i++) {
			bw.write("Hola");
			bw.newLine();
			//Escibimos 10 veces "Hola", y con {bw.newLine()} saltamos una linea
		}
	 
		bw.close();
	}
}
