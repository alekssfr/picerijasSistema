import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Klients {

	public static void registretPasutijumu(ArrayList<String> adrese, ArrayList<String> talrunis, ArrayList<String> vards, ArrayList<String> piegade) {
		String klientaVards = JOptionPane.showInputDialog("Ievadi klienta vārdu:");
		vards.add(0,klientaVards);
		String klientaAdrese = JOptionPane.showInputDialog("Ievadi klienta adresi");
		adrese.add(0,klientaAdrese);
		String klientaTalrunis = JOptionPane.showInputDialog("Ievadi klienta tālruņa nr.:");
		talrunis.add(0,klientaTalrunis);
		int arPiegadi = JOptionPane.showConfirmDialog(null, "Vai pasūtījumu jāpiegādā?",
                "Piegāde", JOptionPane.YES_NO_OPTION);
		 if (arPiegadi == JOptionPane.YES_OPTION) {
	            piegade.add("Jā");
	            JOptionPane.showMessageDialog(null, "Pasūtījums ir ar piegādi");
	        } else if (arPiegadi == JOptionPane.NO_OPTION) {
	        	piegade.add("Nē");
	            JOptionPane.showMessageDialog(null, "Pasūtījums ir uz vietas");
	    }
	}
}
