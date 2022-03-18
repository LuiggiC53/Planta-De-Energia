
public class Total {
	public double Total(String region) {
	double dinero_t;
	if(region.toLowerCase().equals("costa")) {
	double cartera =0;
	int totalConsumo = 0;
	int [] consumos = {120, 55, 32, 120, 75, 32, 150, 55, 32, 120, 97, 32};
		for (int i = 0; i < consumos.length; i++) {
		totalConsumo += consumos[i];
		}
		cartera = totalConsumo *84;
		int totalconsumo = 0;
		int [] consumos1 = {310, 220, 321, 310, 220, 321, 310, 220,
		321, 310, 220, 321};
		for (int i = 0; i < consumos1.length; i++) {
		totalconsumo += consumos1[i];
		}
		double dinero1 = totalconsumo *84;
		dinero_t = cartera+dinero1;
		return dinero_t;
		}
		if(region.toLowerCase().equals("sierra")) {
		double dinero =0;
		int totalConsumo = 0;
		int [] consumos = {400, 432, 400, 432, 420, 432, 460, 432,
		400, 432, 300 , 213};
		for (int i = 0; i < consumos.length; i++) {
		totalConsumo += consumos[i];
		}
		dinero = totalConsumo *65;
		int totalconsumo = 0;
		int [] consumos1 = {400, 432, 587, 400, 432, 587, 400, 432, 587, 400, 432, 587};
		for (int i = 0; i < consumos1.length; i++) {
		totalconsumo += consumos1[i];
		}
		double dinero1 = totalconsumo *79;
		dinero_t = dinero+dinero1;
		return dinero_t;
		}
		if(region.toLowerCase().equals("oriente")) {
		return 0;
		}
		return 0;
		}
		
}
