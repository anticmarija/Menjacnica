package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	

	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	
	
	public String toString () {
		return "Valuta: "+naziv+", skraceno " +skraceniNaziv+" na dan: "+datum+" ima prodajni kurs: "
				+prodajniKurs+", kupovni: "+kupovniKurs+" i srednji: "+srednjiKurs;
	
	}
	
	public boolean equals (Object obj) {
		if (this == obj)
		return true;
	
	if (obj == null)
		return false;
	
	if (this.getClass() != obj.getClass())
		return false;
	
	Valuta v = (Valuta) obj;
	if (this.getNaziv().equals(v.getNaziv()))
		return true;
	
	return false;
	}
	
	
}
