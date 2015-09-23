package pays;

import java.util.List;

import dao.HibernateClient;
import metier.Pays;

public class WSPays implements IWSPays {
	@Override
	public String getCapitale(String pays) {
		HibernateClient unGestClient = new HibernateClient();
		Pays p = unGestClient.getUnPays(pays);
		return p.getNomCapitale();
	}

	@Override
	public long getNombreHab(String pays) {
		HibernateClient unGestClient = new HibernateClient();
		Pays p = unGestClient.getUnPays(pays);
		return p.getNbHabitants();
	}

	@Override
	public String[] getPays() {
		String[] array = null;
		HibernateClient unGestClient = new HibernateClient();
		List<Pays> pays = unGestClient.getTouslesPays();
		if (pays != null && !pays.isEmpty()) {
			array = new String[pays.size()];
			int i = 0;
			for (Pays p : pays) {
				array[i] = p.getNomPays();
				i++;
			}
		}
		System.out.println(array.toString());
		return array;
	}

}
