import java.io.*;
	public class Flujos2 {
		public static void main ( String [] args) throws IOException {
		/*Crea el siguiente array de String e inserta en el fichero las cadenas una a una usando el método write (String str)*/
		File fout = new File("C:\\Users\\Usuario\\Desktop\\prueba.txt");
		FileWriter fic = new FileWriter (fout);
		//Guardando el archivo en una variable tipo FileWriter para escribir en el
		String prov[] = {"Albacete", "Avila", "Badajoz", "Caceres", "Huelva", "Jaen",
				"Madrid", "Segovia", "Soria", "Toledo", "Valladolid", "Zamora"};
		//Array de ciudades
		for (int i=0; i < prov.length; i++) {
			fic.write (prov[i]);
			//Recorremos el archivo segun su tamaño, y vamos agregando el array de ciudades
			fic.append ("*");
		}
		fic.close ();
}
}
