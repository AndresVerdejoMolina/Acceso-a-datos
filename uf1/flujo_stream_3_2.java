package Acceso_a_datos;
import java.io.*;

public class flujo_strems_3 {

	public static void main(String[] args)throws IOException {
		File fout = new File("C:\\Users\\Usuario\\Desktop\\prueba.txt");
		FileOutputStream fos = new FileOutputStream(fout);
	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	 
		for (int i = 0; i < 10; i++) {
			bw.write("Hola");
			bw.newLine();
		}
	 
		bw.close();
	}
}
