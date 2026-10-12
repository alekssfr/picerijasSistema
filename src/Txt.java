import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Txt {

	public static void skatitAktivos() throws FileNotFoundException {
		File lasit = new File("aktivie.txt");
		Scanner scan = new Scanner(lasit);
		
		while(scan.hasNextLine()) {
		String rinda = scan.nextLine();
		System.out.println(rinda);
		}
		scan.close();
	}

	public static void skatitNodotos() throws FileNotFoundException {
		File lasit = new File("nodotie.txt");
		Scanner scan = new Scanner(lasit);
		
		while(scan.hasNextLine()) {
		String rinda = scan.nextLine();
		System.out.println(rinda);
		}
		scan.close();
		
	}
	
}
