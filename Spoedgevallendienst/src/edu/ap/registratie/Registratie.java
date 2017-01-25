package edu.ap.registratie;

public class Registratie {

	private String interventiedatum;
	private String patiŽntNaam;
	private String geboortedatum;
	private String verpleegkundigeNaam;
	private String diagnose;
	
	public Registratie(String datum, String patiŽnt, String geboorte, String verpleegkundige, String diagnose){
		this.interventiedatum = datum;
		this.patiŽntNaam = patiŽnt;
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

	public String getPatiŽntNaam() {
		return patiŽntNaam;
	}

	public void setPatiŽntNaam(String patiŽntNaam) {
		this.patiŽntNaam = patiŽntNaam;
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
		return "PatiŽnt " + this.patiŽntNaam + " geboren op " + this.geboortedatum + 
		" werd behandeld op " + this.interventiedatum + " door " + 
		this.verpleegkundigeNaam + ". De diagnose is " + this.diagnose;
	}
}
