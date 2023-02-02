package edu.monmouth.StringOperations;

import java.util.ArrayList;
import java.util.List;

public class StringOperations {
	
	private String str;
	public StringOperations(String str) {
		this.str = str;
	}
	
	public String lettersOnly() {
		if(str.equals(null) == false && str.equals("") == false) {
		int lenOfStr = str.length();
		StringBuilder letters = new StringBuilder();
		for(int i =0; i<lenOfStr; i++) {
			if (Character.isLetter(Character.toLowerCase(str.charAt(i)))== true) {
				letters.append(str.charAt(i));
			}
		  }
	
		return letters.toString();
		}else {
			return null;
		}
		
	}
	

	public String uppersOnly() {
		if(str.equals(null) == false && str.equals("") == false) {
		int lenOfStr = str.length();
		StringBuilder letters = new StringBuilder();
		for(int i =0; i<lenOfStr; i++) {
			if (Character.isLetter(str.charAt(i)) == true && Character.isUpperCase(str.charAt(i))) {
				letters.append(str.charAt(i));
			}
		}
		return letters.toString();
		}else {
			return null;
		}
	}
	
	
	public String numberOfVowels() {
		if(str.equals(null) == false && str.equals("") == false) {
		str.toLowerCase();
		int lenOfStr = str.length();
		StringBuilder letters = new StringBuilder();
		for(int i =0; i<lenOfStr; i++) {
			if(str.charAt(i) == 'a' || str.charAt(i)== 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				letters.append(str.charAt(i));
			}
		}
		
		String lettersLen = String.valueOf(letters.length());
		
		
		return lettersLen;
		}else {
			return null;
		}
	}
	
	
	public String numberOfConsonants() {
		if(str.equals(null) == false && str.equals("") == false) {
		str.toLowerCase();
		StringBuilder letters = new StringBuilder();
		List<Character> consonants = new ArrayList<Character>();
		consonants.add('b'); consonants.add('c'); consonants.add('d'); consonants.add('f'); consonants.add('g');
		consonants.add('h'); consonants.add('j'); consonants.add('k'); consonants.add('l'); consonants.add('m');
		consonants.add('n'); consonants.add('p'); consonants.add('q'); consonants.add('r'); consonants.add('s');
		consonants.add('t'); consonants.add('v'); consonants.add('x'); consonants.add('z'); consonants.add('w'); 
		consonants.add('y');
		
		int lenOfString = str.length();
		str.toLowerCase();
		
		for(int i = 0; i<lenOfString; i++) {
			if (consonants.contains(str.charAt(i))){
				letters.append(str.charAt(i));
				
				
			}
		}
		String lettersLen = String.valueOf(letters.length());
		return lettersLen;
		}else {
			return null;
		}
	}
	
	public String reverseString() {
		if(str.equals(null) == false && str.equals("") == false) {
		StringBuilder letters = new StringBuilder();
		int lenOfString = str.length();
		for(int i = lenOfString-1; i > -1; i--) {
			
			letters.append(str.charAt(i));
		}
		return letters.toString();
		}else {
			return null;
		}
	}
	

}
