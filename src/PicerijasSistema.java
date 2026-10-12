import java.util.ArrayList;

import javax.swing.JOptionPane;
public class PicerijasSistema {

	public static void main(String[] args) {
		String izvele=null;
		ArrayList<String> adrese = new ArrayList<String>();
		ArrayList<String> talrunis = new ArrayList<String>();
		ArrayList<String> vards = new ArrayList<String>();
		ArrayList<String> piegade = new ArrayList<String>();
		
		do {
			izvele = JOptionPane.showInputDialog("Ievadi izvēli:");
			switch(izvele) {
			case "0":
				break;
			case "1":
				Klients.registretPasutijumu(adrese, talrunis, vards, piegade);
				break;
			case "2":
				
				break;
			}
		}while(!izvele.equals("0"));
	}

}
