package sk.tuke.seregely.dipl.bug.entity;

// Generated Mar 29, 2013 7:59:27 PM by Hibernate Tools 4.0.0

/**
 * ProjektRiesitel generated by hbm2java
 */
public class ProjektRiesitel implements java.io.Serializable {

	private ProjektRiesitelId id;
	private Projekt projekt;
	private Riesitel riesitel;

	public ProjektRiesitel() {
	}

	public ProjektRiesitel(ProjektRiesitelId id, Projekt projekt,
			Riesitel riesitel) {
		this.id = id;
		this.projekt = projekt;
		this.riesitel = riesitel;
	}

	public ProjektRiesitelId getId() {
		return this.id;
	}

	public void setId(ProjektRiesitelId id) {
		this.id = id;
	}

	public Projekt getProjekt() {
		return this.projekt;
	}

	public void setProjekt(Projekt projekt) {
		this.projekt = projekt;
	}

	public Riesitel getRiesitel() {
		return this.riesitel;
	}

	public void setRiesitel(Riesitel riesitel) {
		this.riesitel = riesitel;
	}

}