package sk.tuke.seregely.dipl.bug.entity;
// default package
// Generated Apr 6, 2013 9:28:57 AM by Hibernate Tools 4.0.0

/**
 * CiselnikStavov generated by hbm2java
 */
public class CiselnikStavov implements java.io.Serializable {

	private int idStavu;
	private String nazov;

	public CiselnikStavov() {
	}

	public CiselnikStavov(int idStavu) {
		this.idStavu = idStavu;
	}

	public CiselnikStavov(int idStavu, String nazov) {
		this.idStavu = idStavu;
		this.nazov = nazov;
	}

	public int getIdStavu() {
		return this.idStavu;
	}

	public void setIdStavu(int idStavu) {
		this.idStavu = idStavu;
	}

	public String getNazov() {
		return this.nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

}
