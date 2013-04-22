package sk.tuke.seregely.dipl.bug.entity;

public class ProjektRiesitel {
	
	private Projekt projekt;
	private Riesitel riesitel;
	private int idProjektRiesitel;
	
	public ProjektRiesitel() {
	}
	
	public ProjektRiesitel(Riesitel u, Projekt p) {
		riesitel = u;
		projekt = p;
	}
	
	public Riesitel getRiesitel() {
		return riesitel;
	}
	public void setRiesitel(Riesitel uzivatel) {
		this.riesitel = uzivatel;
	}
	public Projekt getProjekt() {
		return projekt;
	}
	public void setProjekt(Projekt projekt) {
		this.projekt = projekt;
	}

	public int getIdProjektRiesitel() {
		return idProjektRiesitel;
	}

	public void setIdProjektRiesitel(int idProjektRiesitel) {
		this.idProjektRiesitel = idProjektRiesitel;
	}

}
