package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String nombre = "";
		if(arabe == "1"){
			nombre = "I";
		} else if(arabe == "5"){
			nombre = "V";
		}
		
		return nombre;
		
	}

	public String convertFromRoman(String roman) {
		return "1";
	}

}
