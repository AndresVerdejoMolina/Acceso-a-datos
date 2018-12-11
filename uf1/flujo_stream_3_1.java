
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class flujo_stream_3_1 {

public static void main(String[]args) throws IOException{
	/*Escribe un programa en java que muestre por pantalla un fichero de texto que le pasamos como argumento (o utilizando scanner) utilizando la clase BufferedReader*/	System.out.println("introduce la ruta: ");
	Scanner scan = new Scanner(System.in);
	String linea = scan.nextLine();
    FileReader in = new FileReader(linea);
	//guardando la entrada en una variable tipo FileReader para leer
    BufferedReader br = new BufferedReader(in);

    String line;
    while ((line = br.readLine()) != null) {
	    //Imprimiendo linea a linea
        System.out.println(line);
    }
    in.close();

}
}
