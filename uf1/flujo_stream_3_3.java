package Acceso_a_datos;
import java.io.*;

public class flujo_strems_3 {

	public static void main(String[] args)throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Usuario\\Desktop\\prueba.txt"));
		 
		for (int i = 0; i < 10; i++) {
			
			pw.println("something");
		}
	 
		pw.close();
	}
}
