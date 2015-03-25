package menjacnica;

import java.util.LinkedList;

public class Menjacnica {

	private String ime; 
	private LinkedList <Valuta> valute = new LinkedList<Valuta>();
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String toString() {
		
		String nazivi = "";
		
		for (int i =0; i < valute.size(); i++) {
			nazivi = valute.get(i).getNaziv() + " ";
		}
		return "Menjacnica ima: "+nazivi;
	}
	
	public boolean equals (Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (this.getClass() != obj.getClass())
			return false;
		
		Menjacnica m = (Menjacnica) obj;
		if (this.getIme().equals(m.getIme()))
			return true;
		
		return false;
	}
}
