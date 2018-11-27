package Acceso_a_datos;

public class Gestion_ficheros_ej5 {

	public static void main(String[] args) {
		File f=null;
		File[] paths;
		try {
			for (String s: args) {
				f= new File(s);
				paths = f.listFiles();
				for(File path:paths) {
					System.out.println("Nombre del fichero: " + f.getName() + ", Ruta Relativa: " + f.getPath() + ", Ruta abosoluta: " + f.getAbsolutePath() + ", Permiso para escribir: " + f.canWrite() + ", Permiso para leer: " + f.canRead() + ", Tamaño de archivo: " + f.length());
					
				}
			}
		}catch(NullPointerException e) {
			System.out.println("No existe");
		}

	}

}
