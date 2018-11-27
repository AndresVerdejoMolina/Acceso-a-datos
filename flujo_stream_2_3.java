import java.io.*;
	public class Flujos2 {
		public static void main ( String [] args) throws IOException {
		File fout = new File("C:\\Users\\Usuario\\Desktop\\prueba.txt");
		FileWriter fic = new FileWriter (fout);
		String prov[] = {"Albacete", "Avila", "Badajoz", "Caceres", "Huelva", "Jaen",
				"Madrid", "Segovia", "Soria", "Toledo", "Valladolid", "Zamora"};
		for (int i=0; i < prov.length; i++) {
			fic.write (prov[i]);
			fic.append ("*");
		}
		fic.close ();
}
}
