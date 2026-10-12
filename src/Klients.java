import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Klients {

	public static void registretPasutijumu(ArrayList<String> adrese, ArrayList<String> talrunis, ArrayList<String> vards) {
		String klientaVards = JOptionPane.showInputDialog("Ievadi klienta vārdu:");
		vards.add(klientaVards);
		String klientaAdrese = JOptionPane.showInputDialog("Ievadi klienta adresi");
		adrese.add(klientaAdrese);
		String klientaTalrunis = JOptionPane.showInputDialog("Ievadi klienta tālruņa nr.:");
		talrunis.add(klientaTalrunis);
	}

}
