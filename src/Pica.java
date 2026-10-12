import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pica {

	public static void picasIzvele(ArrayList<Integer> izmers, ArrayList<String> uzkodas, ArrayList<String> dzerieni) {
		String picasIzmers = JOptionPane.showInputDialog("Ievadi picas izmēru (15, 20, 25, 30 cm):");
		int picaInt = Integer.parseInt(picasIzmers);
		izmers.add(0,picaInt);
		String picasUzkodas = JOptionPane.showInputDialog("Ievadi uzkodas (bez atstarpēm, atdalītas ar komatiem)");
		uzkodas.add(0,picasUzkodas);
		String picasDzerieni = JOptionPane.showInputDialog("Ievadi dzērienus (bez atstarpēm, atdalītas ar komatiem)");
		dzerieni.add(0,picasDzerieni);
	}

}
