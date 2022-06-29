package anonymes;
/**
 * 
 * @author Formation
 *
 */
public class TestOperation {

	public static void main(String[] args) {
		// on instancie une interface
		Operation ope = new Operation() {// dont on fait une implémentation à la volée
			
			@Override
			public int calculer(int a, int b) {
				return a+b;
			}
		};
		System.out.println(ope.calculer(5, 7));
		

	}

}
