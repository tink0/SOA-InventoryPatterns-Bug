package sk.tuke.seregely.dipl.bug.entity;

// Generated Mar 29, 2013 7:59:27 PM by Hibernate Tools 4.0.0

/**
 * VylepsenieRiesitel generated by hbm2java
 */
public class VylepsenieRiesitel implements java.io.Serializable {

	private VylepsenieRiesitelId id;
	private Vylepsenie vylepsenie;
	private Riesitel riesitel;

	public VylepsenieRiesitel() {
	}

	public VylepsenieRiesitel(VylepsenieRiesitelId id, Vylepsenie vylepsenie,
			Riesitel riesitel) {
		this.id = id;
		this.vylepsenie = vylepsenie;
		this.riesitel = riesitel;
	}

	public VylepsenieRiesitelId getId() {
		return this.id;
	}

	public void setId(VylepsenieRiesitelId id) {
		this.id = id;
	}

	public Vylepsenie getVylepsenie() {
		return this.vylepsenie;
	}

	public void setVylepsenie(Vylepsenie vylepsenie) {
		this.vylepsenie = vylepsenie;
	}

	public Riesitel getRiesitel() {
		return this.riesitel;
	}

	public void setRiesitel(Riesitel riesitel) {
		this.riesitel = riesitel;
	}

}
