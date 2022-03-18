import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Datos {
	
	
	Map<String, Integer> mp = new HashMap<>();
	public Map diccionario(String ciudad){
	if(ciudad.toLowerCase().equals("quito")) {
	int totalConsumo = 0;
	int [] consumos = {400, 432, 400, 432, 420, 432, 460, 432,
	400, 432, 300 , 213};
	for (int i = 0; i < consumos.length; i++) {
	totalConsumo += consumos[i];
	}
	mp.put("Coca Codo Sinclair", totalConsumo);
	int totalconsumo = 0;
	int [] consumos1 = {400, 432, 587, 400, 432, 587, 400, 432,
	587, 400, 432, 587};
	for (int i = 0; i < consumos1.length; i++) {
	totalconsumo += consumos1[i];
	}
	mp.put("Sopladora", totalconsumo);
	return mp;
	}
	
	
}
