package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import erreur.ServiceHibernateException;
import metier.Pays;
import service.ServiceHibernate;

public class HibernateClient {

	private Session session;

	// On r�cup�re toutes les lignes de la table dans une liste
	/*
	 * (non-Javadoc)
	 * 
	 * @see hibernate.service.InterfaceHibrnateStage#getTouteslesLignes()
	 */

	public List<Pays> getTouslesPays() throws HibernateException, ServiceHibernateException {
		List<Pays> mesPays = null;
		try {
			session = ServiceHibernate.currentSession();
			// On passe une requ�te de type SQL mlais on travaille sur la
			// classe
			Query query = session.createQuery("select p from Pays as p");
			mesPays = query.list();
		} catch (Exception ex) {
			System.out.println("Erreur ServiceHiber : " + ex.getMessage());
		}
		return mesPays;
	}

	public Pays getUnPays(String nomPays) throws HibernateException, ServiceHibernateException {
		Pays pays = null;
		try {
			session = ServiceHibernate.currentSession();
			Query query = session.createQuery("SELECT p FROM Pays AS p where p.nomPays = '" + nomPays + "'");
			List<Pays> lesPays = query.list();
			if (lesPays != null && lesPays.size() > 0) {
				pays = lesPays.get(0);
			}
		} catch (Exception ex) {
			System.out.println("Erreur ServiceHiber : " + ex.getMessage());
		}
		return pays;
	}
}