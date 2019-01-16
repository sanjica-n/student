package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ucitajCSV {

	public static void ucitaj () {
	Scanner in;
	
	try 
	{
		in = new Scanner(new FileReader("doc/studenti.csv"));
		
		String line;
		
		while(in.hasNextLine())
		{
			line = in.nextLine();
			String ime;
			String prezime;
			String index;
			
			String [] Student1 = line.split(",");
			int brojOcena = Student1.length - 4;
			ime = Student1[0];
			prezime = Student1[1];
			index = Student1[2] + "/" + Student1[3];
			int [] ocene = new int [brojOcena];
			for (int i = 4; i < Student1.length; i++) {
				ocene[i-4] = Integer.parseInt(Student1[i]);
			}
			//Student st = new Student (ime, prezime, index, ocene);
			test.studenti.add(new Student (ime, prezime, index, ocene));
		}
		in.close();
	} 
	catch (FileNotFoundException e) 
	{
		System.out.println("Greska: Fajl ulaz.txt ne postoji!");
	}
}
}
