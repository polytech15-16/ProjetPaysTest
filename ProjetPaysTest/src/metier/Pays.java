package metier;
// Generated 23 sept. 2015 09:47:23 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Pays generated by hbm2java
 */
@Entity
@Table(name = "pays", catalog = "mespays", uniqueConstraints = @UniqueConstraint(columnNames = "NOM_CAPITALE") )
public class Pays implements java.io.Serializable {

	private String nomPays;
	private String nomCapitale;
	private long nbHabitants;

	public Pays() {
	}

	public Pays(String nomPays, String nomCapitale, long nbHabitants) {
		this.nomPays = nomPays;
		this.nomCapitale = nomCapitale;
		this.nbHabitants = nbHabitants;
	}

	@Id
	@Column(name = "NOM_PAYS", unique = true, nullable = false, length = 100)
	public String getNomPays() {
		return this.nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	@Column(name = "NOM_CAPITALE", unique = true, nullable = false, length = 100)
	public String getNomCapitale() {
		return this.nomCapitale;
	}

	public void setNomCapitale(String nomCapitale) {
		this.nomCapitale = nomCapitale;
	}

	@Column(name = "NB_HABITANTS", nullable = false)
	public long getNbHabitants() {
		return this.nbHabitants;
	}

	public void setNbHabitants(long nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

}
