import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class PicerijasSistema {

	public static void main(String[] args) throws IOException {
		String izvele=null;
		int pasutijumuSkaits=0;
		ArrayList<String> adrese = new ArrayList<String>();
		ArrayList<String> talrunis = new ArrayList<String>();
		ArrayList<String> vards = new ArrayList<String>();
		ArrayList<String> piegade = new ArrayList<String>();
		
		ArrayList<Integer> izmers = new ArrayList<Integer>();
		ArrayList<String> uzkodas = new ArrayList<String>();
		ArrayList<String> dzerieni = new ArrayList<String>();
		ArrayList<Double> cena = new ArrayList<Double>();
		
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
				Txt.aprekinaCenu(cena, adrese, talrunis, vards, piegade, izmers, uzkodas, dzerieni);
				break;
			case "6":
				Txt.saglabatPasutijumu(cena, adrese, talrunis, vards, piegade, izmers, uzkodas, dzerieni, pasutijumuSkaits);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Kļūda", "Kļūda", 
                        JOptionPane.INFORMATION_MESSAGE);
			}
		}while(!izvele.equals("0"));
	}

}
