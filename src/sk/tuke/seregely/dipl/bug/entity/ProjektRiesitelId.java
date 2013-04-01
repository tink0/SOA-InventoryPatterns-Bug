package sk.tuke.seregely.dipl.bug.entity;

// Generated Mar 29, 2013 7:59:27 PM by Hibernate Tools 4.0.0

/**
 * ProjektRiesitelId generated by hbm2java
 */
public class ProjektRiesitelId implements java.io.Serializable {

	private int idRiesitela;
	private int idProjektu;

	public ProjektRiesitelId() {
	}

	public ProjektRiesitelId(int idRiesitela, int idProjektu) {
		this.idRiesitela = idRiesitela;
		this.idProjektu = idProjektu;
	}

	public int getIdRiesitela() {
		return this.idRiesitela;
	}

	public void setIdRiesitela(int idRiesitela) {
		this.idRiesitela = idRiesitela;
	}

	public int getIdProjektu() {
		return this.idProjektu;
	}

	public void setIdProjektu(int idProjektu) {
		this.idProjektu = idProjektu;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProjektRiesitelId))
			return false;
		ProjektRiesitelId castOther = (ProjektRiesitelId) other;

		return (this.getIdRiesitela() == castOther.getIdRiesitela())
				&& (this.getIdProjektu() == castOther.getIdProjektu());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdRiesitela();
		result = 37 * result + this.getIdProjektu();
		return result;
	}

}
