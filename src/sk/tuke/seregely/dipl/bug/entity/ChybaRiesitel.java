package sk.tuke.seregely.dipl.bug.entity;

// Generated Mar 29, 2013 7:59:27 PM by Hibernate Tools 4.0.0

/**
 * ChybaRiesitel generated by hbm2java
 */
public class ChybaRiesitel implements java.io.Serializable {

	private ChybaRiesitelId id;
	private Riesitel riesitel;
	private Chyba chyba;

	public ChybaRiesitel() {
	}

	public ChybaRiesitel(ChybaRiesitelId id, Riesitel riesitel, Chyba chyba) {
		this.id = id;
		this.riesitel = riesitel;
		this.chyba = chyba;
	}

	public ChybaRiesitelId getId() {
		return this.id;
	}

	public void setId(ChybaRiesitelId id) {
		this.id = id;
	}

	public Riesitel getRiesitel() {
		return this.riesitel;
	}

	public void setRiesitel(Riesitel riesitel) {
		this.riesitel = riesitel;
	}

	public Chyba getChyba() {
		return this.chyba;
	}

	public void setChyba(Chyba chyba) {
		this.chyba = chyba;
	}

}