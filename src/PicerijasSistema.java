import javax.swing.JOptionPane;
public class PicerijasSistema {

	public static void main(String[] args) {
		String izvele=null;
		String adrese = null, talrunis = null, vards = null;
		
		do {
			izvele = JOptionPane.showInputDialog("Ievadi izvēli:");
			switch(izvele) {
			case "0":
				break;
			case "1":
				Klients.registretPasutijumu(adrese, talrunis, vards);
				break;
			}
		}while(!izvele.equals("0"));
	}

}
