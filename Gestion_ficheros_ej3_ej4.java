package Acceso_a_datos;
import java.io.File;

public class Gestion_ficheros_ej3_ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=null;
		File[] paths;
		try {
			for (String s: args) {
				f= new File(s);
				paths = f.listFiles();
				for(File path:paths) {
					System.out.println(path);
					
				}
			}
		}catch(NullPointerException e) {
			System.out.println("No existe");
		}

	}

}
