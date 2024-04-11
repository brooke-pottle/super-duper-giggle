import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) throws IOException {
		
		double total;
		
		
		
		AminoAcid alanine = new AminoAcid("Alanine", 'a');
		alanine.addCodon("GCT");
		alanine.addCodon("GCC");
		alanine.addCodon("GCA");
		alanine.addCodon("GCG");
		
		System.out.println(calcCodonRF1(alanine.getCodon(0)));
		System.out.println(calcCodonRF1(alanine.getCodon(1)));
		System.out.println(calcCodonRF1(alanine.getCodon(2)));
		System.out.println(calcCodonRF1(alanine.getCodon(3)));
		System.out.println(calcCodonRF1(alanine.getCodon(0)));
		
		total = calcCodonRF1(alanine.getCodon(0)) + calcCodonRF1(alanine.getCodon(1)) + 
				calcCodonRF1(alanine.getCodon(2)) + calcCodonRF1(alanine.getCodon(3));
		
		System.out.println(total);
		System.out.print(calcCodonRF1(alanine.getCodon(0)) / total);
		
	
			

	}

	/**
	 * 
	 * @param codon This is the codon the user is searching for
	 * @return counter This is the amount of codons in the sequence 
	 * @throws IOException
	 */
	public static double calcCodonRF1(String codon) throws IOException { 
	
		double counter = 0;
		String[] tokens = {};
	
		
		File inFile = new File("measlesSequenceRF1.csv");
		Scanner scanFile = new Scanner(inFile);
		
		while(scanFile.hasNext()) {
			String line = scanFile.nextLine();
			tokens = line.split(",");
			}
		
		for(String c : tokens) {
			if(c.equals(codon)) {
				counter++;
			}
			
		}
		scanFile.close();
		return counter;
	}
	
	public static double calcCodonRF2(String codon) throws IOException { 
		
		double counter = 0;
		String[] tokens = {};
	
		
		File inFile = new File("measlesSequenceRF2.csv");
		Scanner scanFile = new Scanner(inFile);
		
		while(scanFile.hasNext()) {
			String line = scanFile.nextLine();
			tokens = line.split(",");
			}
		
		for(String c : tokens) {
			if(c.equals(codon)) {
				counter++;
			}
			
		}
		scanFile.close();
		return counter;
	}
	
	public static double calcCodonRF3(String codon) throws IOException { 
		
		double counter = 0;
		String[] tokens = {};
	
		
		File inFile = new File("measlesSequenceRF3.csv");
		Scanner scanFile = new Scanner(inFile);
		
		while(scanFile.hasNext()) {
			String line = scanFile.nextLine();
			tokens = line.split(",");
			}
		
		for(String c : tokens) {
			if(c.equals(codon)) {
				counter++;
			}
			
		}
		scanFile.close();
		return counter;
	}

}


