package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		String nombre = "";
		
		Integer nb = Integer.parseInt(arabe);
		
		while(nb > 0){
			if(nb/5 > 0){
				nombre += "V";
				nb = nb - 5;
			} 
			
			if(nb/1 > 0){
				nombre += "I";
				nb = nb - 1;
			}
		}
		
		
		/*if(arabe == "1"){
			nombre = "I";
		} else if(arabe == "5"){
			nombre = "V";
		} */
		
		return nombre;
		
	}

	public String convertFromRoman(String roman) {
		return "1";
	}

}
