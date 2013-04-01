package sk.tuke.seregely.dipl.bug.entity;

// Generated Mar 29, 2013 7:59:27 PM by Hibernate Tools 4.0.0

/**
 * VylepsenieRiesitelId generated by hbm2java
 */
public class VylepsenieRiesitelId implements java.io.Serializable {

	private int idRiesitela;
	private int idVylepsenia;

	public VylepsenieRiesitelId() {
	}

	public VylepsenieRiesitelId(int idRiesitela, int idVylepsenia) {
		this.idRiesitela = idRiesitela;
		this.idVylepsenia = idVylepsenia;
	}

	public int getIdRiesitela() {
		return this.idRiesitela;
	}

	public void setIdRiesitela(int idRiesitela) {
		this.idRiesitela = idRiesitela;
	}

	public int getIdVylepsenia() {
		return this.idVylepsenia;
	}

	public void setIdVylepsenia(int idVylepsenia) {
		this.idVylepsenia = idVylepsenia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VylepsenieRiesitelId))
			return false;
		VylepsenieRiesitelId castOther = (VylepsenieRiesitelId) other;

		return (this.getIdRiesitela() == castOther.getIdRiesitela())
				&& (this.getIdVylepsenia() == castOther.getIdVylepsenia());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdRiesitela();
		result = 37 * result + this.getIdVylepsenia();
		return result;
	}

}