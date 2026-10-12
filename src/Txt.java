import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

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

	public static void saglabatPasutijumu(ArrayList<String> adrese, ArrayList<String> talrunis,
			ArrayList<String> vards, ArrayList<String> piegade, ArrayList<Integer> izmers,
			ArrayList<String> uzkodas, ArrayList<String> dzerieni, int pasutijumuSkaits) throws IOException {
		
		String failaNosaukums=null;
		pasutijumuSkaits++;
		
		int izvele = JOptionPane.showConfirmDialog(null, "Atvērt aktīvos pasūtījumus? (Jā - aktīvie, Nē - nodotie)",
                "Izvēle", JOptionPane.YES_NO_OPTION);
		if (izvele == JOptionPane.YES_OPTION) {
            failaNosaukums = "aktivie.txt";
            JOptionPane.showMessageDialog(null, "Nesenākais pasūtījums saglabāts aktivie.txt");
        } else if (izvele == JOptionPane.NO_OPTION) {
        	failaNosaukums = "nodotie.txt";
            JOptionPane.showMessageDialog(null, "Nesenākais pasūtījums saglabāts nodotie.txt");
    }
		PrintWriter raksta = new PrintWriter(new FileWriter(failaNosaukums, true));
		raksta.println(vards.size());
		raksta.println(vards.get(0));
		raksta.println(adrese.get(0));
		raksta.println(talrunis.get(0));
		raksta.println(piegade.get(0));
		raksta.println(izmers.get(0));
		raksta.println(uzkodas.get(0));
		raksta.println(dzerieni.get(0));
		raksta.close();
	}
	
}
