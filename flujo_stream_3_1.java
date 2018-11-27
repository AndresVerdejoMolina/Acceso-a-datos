
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class flujo_stream_3_1 {

public static void main(String[]args) throws IOException{
	System.out.println("introduce la ruta: ");
	Scanner scan = new Scanner(System.in);
	String linea = scan.nextLine();
    FileReader in = new FileReader(linea);
    BufferedReader br = new BufferedReader(in);

    String line;
    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
    in.close();

}
}
