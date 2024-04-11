import java.util.ArrayList;

public class AminoAcid {
	
	private String fullName;
	private char aminoLetter;
	private ArrayList<String> aminoCodon;
	
	public AminoAcid(String name, char letter) {
		aminoCodon = new ArrayList<>();
		fullName = name;
		aminoLetter = letter;
	}
	
	public void setName(String name) {
		fullName = name;
	}
	
	public void setLetter(char letter) {
		aminoLetter = letter;
	}
	
	public String getName() {
		return fullName;
	}
	
	public char getLetter() {
		return aminoLetter;
	}
	
	public void addCodon(String codon) {
		aminoCodon.add(codon);
		
	}
	
	public String getCodon(int num) {
		return aminoCodon.get(num);
	}
	
	public int getListSize() {
		return aminoCodon.size();
	}
	
	public ArrayList<String> getCodonList() {
		return aminoCodon;
	}
	
	public String toString() {
		return "Amino Acid: " + fullName + "\nAbbreviation: " + aminoLetter;
	}
	
}
