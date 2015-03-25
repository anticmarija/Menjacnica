package menjacnica.interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {

	public void dodajKursNaDan (String valuta, double kurs, GregorianCalendar dan);
	public void obrisiKursZaDan (String valuta, GregorianCalendar dan);
	public double pronadjiKursZaDan (String valuta, GregorianCalendar dan);
}
