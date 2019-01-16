package test;

import java.util.ArrayList;

public class Student {
	
	private String ime;
	private String prezime;
	private String index;
	private int [] ocene;
	private double prosek;
	
	public Student(String ime, String prezime, String index, int[] ocene) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.index = index;
		this.ocene = ocene;
		
		int zbir = 0;
		for (int i = 0; i < ocene.length; i++) {
			zbir += ocene[i];
		}
		
		this.prosek = (double) zbir / ocene.length;
	}
	
	public static String informacijeOStudentima (Student st) {
		return "Ime: " + st.getIme() + ", index: " + st.getIndex() + 
				", prosek: " + st.getProsek();
	}
	
	public static void prikazSvihStudenta () {
		for (int i = 0; i < test.studenti.size(); i++) {
			System.out.println("Ime: " + test.studenti.get(i).getIme()
			+ " prezime: " + test.studenti.get(i).getPrezime() 
			+ " prosek: " + test.studenti.get(i).getProsek());
			
		}
	}
	
	//GETERI I SETERI
	
	
	public String getIme() {
		return ime;
	}
	public double getProsek() {
		return prosek;
	}

	public void setProsek(double prosek) {
		this.prosek = prosek;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public int[] getOcene() {
		return ocene;
	}
	public void setOcene(int[] ocene) {
		this.ocene = ocene;
	}
	
	

}
