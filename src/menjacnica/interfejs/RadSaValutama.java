package menjacnica.interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Valuta;

public class RadSaValutama implements MenjacnicaInterfejs {

	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	public void dodajKursNaDan(String valuta, double kurs, GregorianCalendar dan) {
		
		Valuta v = new Valuta ();
		v.setDatum(dan);
		v.setSrednjiKurs(kurs);
		v.setNaziv(valuta);
		
		valute.add(v);

	}

	public void obrisiKursZaDan(String valuta, GregorianCalendar dan) {
		for (int i =0; i < valute.size(); i++) {	
			if (valute.get(i).getNaziv().equals(valuta))
				valute.remove(valute.get(i));
		}

	}

	public double pronadjiKursZaDan(String valuta, GregorianCalendar dan) {
		
		double vrednost = 0;
		for (int i =0; i < valute.size(); i++) {	
			if (valute.get(i).getNaziv().equals(valuta))
				vrednost= valute.get(i).getSrednjiKurs();
		}
		
		return vrednost;
	}

}
