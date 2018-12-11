package Acceso_a_datos;

public class Gestion_ficheros_ej5 {

	public static void main(String[] args) {
		/*Realiza un programa Java que muestre la siguiente información de un fichero 
cualquiera: Nombre, ruta relativa, ruta absoluta, permisos y tamaño.*/
		File f=null;
		//Inicializando "f"
		File[] paths;
		//Creando un array de tipo File
		try {
			for (String s: args) {
				//Direccion del fichero guardado en "f"
				f= new File(s);
				paths = f.listFiles();
				for(File path:paths) {
					System.out.println("Nombre del fichero: " + f.getName() + ", Ruta Relativa: " + f.getPath() + ", Ruta abosoluta: " + f.getAbsolutePath() + ", Permiso para escribir: " + f.canWrite() + ", Permiso para leer: " + f.canRead() + ", Tamaño de archivo: " + f.length());
					/*Consiguiendo informacion del fichero:
							Nombre del fichero, ruta relativa, ruta absoluta, en caso de que se pueda escribir devolverá true, en caso de que se pueda escribir devolvera false, en caso de que se pueda leer devolverá true, tamaño del archivo
							*/
					
				}
			}
		}catch(NullPointerException e) {
			//En caso de que no exista el archivo introducido, saltará esta excepción
			System.out.println("No existe");
		}

	}

}
