import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) throws IOException {
		
		String acidTable = "aminoAcidTable.csv";
		String delimiter = ",";
		
		ArrayList<AminoAcid> aminoAcidList = new ArrayList<>();
		
		Scanner inFile = new Scanner(new File(acidTable));
		
		//Skip first line of table header
		inFile.nextLine();
		
		//Repeat until Amino Acid Table is done
		while(inFile.hasNextLine()) {
			
			//Read line and store as a string 
			String line = inFile.nextLine();
			//Split string and initialize a String array with the values
			String[] aminoData = line.split(delimiter);
			//Declare and initialize variables for name and abbreviations 
			String name = aminoData[0];
			String threeLetter = aminoData[1];
			String oneLetter = aminoData[2];
			//Declare an ArrayList and loop to add all codons  
			ArrayList<String> codons = new ArrayList<>();
			for(int i = 3; i < aminoData.length; i++) {
					codons.add(aminoData[i]);
			}
			
			//Create an AminoAcid instance based off of iteration's data
			AminoAcid aminoAcid = new AminoAcid(name, threeLetter, oneLetter, codons);
			aminoAcidList.add(aminoAcid);
			
			}
		
		for(AminoAcid acids : aminoAcidList) {
			System.out.println("Name: " + acids.getName());
			System.out.println("Three Letter Abbreviation: " + acids.getThreeLetter());
			System.out.println("One Letter Abbreviation: " + acids.getOneLetter());
			System.out.println("Codons: " + acids.getCodons());
			System.out.println();
		}
		
		for(AminoAcid acid : aminoAcidList) {
			for(int i = 0; i < acid.getListSize(); i++) {
				System.out.println(calcCodonRF1(acid.getCodon(i)));
			}
		}
		
		
		
			

	}
	

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


