import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class PicerijasSistema {

	public static void main(String[] args) throws FileNotFoundException {
		String izvele=null;
		ArrayList<String> adrese = new ArrayList<String>();
		ArrayList<String> talrunis = new ArrayList<String>();
		ArrayList<String> vards = new ArrayList<String>();
		ArrayList<String> piegade = new ArrayList<String>();
		
		ArrayList<Integer> izmers = new ArrayList<Integer>();
		ArrayList<String> uzkodas = new ArrayList<String>();
		ArrayList<String> dzerieni = new ArrayList<String>();
		
		do {
			izvele = JOptionPane.showInputDialog("Ievadi izvēli:");
			switch(izvele) {
			case "0":
				break;
			case "1":
				Klients.registretPasutijumu(adrese, talrunis, vards, piegade);
				break;
			case "2":
				Pica.picasIzvele(izmers, uzkodas, dzerieni);
				break;
			case "3":
				Txt.skatitAktivos();
				break;
			case "4":
				Txt.skatitNodotos();
				break;
			case "5":
				Txt.saglabatPasutijumu(adrese, talrunis, vards, piegade, izmers, uzkodas, dzerieni);
				break;
			}
		}while(!izvele.equals("0"));
	}

}
