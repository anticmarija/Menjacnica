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
		if (naziv == null || naziv.equals(""))
			throw new RuntimeException("Morate uneti naziv.");
			
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if (skraceniNaziv == null || skraceniNaziv.equals(""))
			throw new RuntimeException("Morate uneti naziv.");
		
		this.skraceniNaziv = skraceniNaziv;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if (datum == null || datum.after(new GregorianCalendar()))
			throw new RuntimeException("Uneli ste neispravan datum.");
		
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs <= 0)
			throw new RuntimeException("Morate uneti pozitivan iznos.");
		
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs <= 0)
			throw new RuntimeException("Morate uneti pozitivan iznos.");
		
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs <= 0)
			throw new RuntimeException("Morate uneti pozitivan iznos.");
		
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
