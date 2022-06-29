package anonymes;

public class TestMethodAnonymes {
	public static void main(String[] arg) {
		// on implemente la fonction calculer de l'interface opération de maniére anonyme
		Operation ope = (a, b) -> {
			return a - b;// et comme il y a une seule instruction on pourrait carrément enlever les accolades.
		}; // et si l'instruction est un return il faudrait aussi enlever l'instruction
		// attention ça ne fonctionne que parce que l'interface n'a qu'une seule méthode
		// abstraite.

		System.out.println(ope.calculer(8, 10));

	}

}
