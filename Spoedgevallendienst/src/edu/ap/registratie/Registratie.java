package edu.ap.registratie;

public class Registratie {

	private String interventiedatum;
	private String patiëntNaam;
	private String geboortedatum;
	private String verpleegkundigeNaam;
	private String diagnose;
	
	public Registratie(String datum, String patiënt, String geboorte, String verpleegkundige, String diagnose){
		this.interventiedatum = datum;
		this.patiëntNaam = patiënt;
		this.geboortedatum = geboorte;
		this.verpleegkundigeNaam = verpleegkundige;
		this.diagnose = diagnose;
	}
	
	public String getInterventiedatum() {
		return interventiedatum;
	}

	public void setInterventiedatum(String interventiedatum) {
		this.interventiedatum = interventiedatum;
	}

	public String getPatiëntNaam() {
		return patiëntNaam;
	}

	public void setPatiëntNaam(String patiëntNaam) {
		this.patiëntNaam = patiëntNaam;
	}

	public String getGeboortedatum() {
		return geboortedatum;
	}

	public void setGeboortedatum(String geboortedatum) {
		this.geboortedatum = geboortedatum;
	}

	public String getVerpleegkundigeNaam() {
		return verpleegkundigeNaam;
	}

	public void setVerpleegkundigeNaam(String verpleegkundigeNaam) {
		this.verpleegkundigeNaam = verpleegkundigeNaam;
	}

	public String getDiagnose() {
		return diagnose;
	}

	public void setDiagnose(String diagnose) {
		this.diagnose = diagnose;
	}
	
	public String toString(){
		return "Patiënt " + this.patiëntNaam + " geboren op " + this.geboortedatum + 
		" werd behandeld op " + this.interventiedatum + " door " + 
		this.verpleegkundigeNaam + ". De diagnose is " + this.diagnose;
	}
}
