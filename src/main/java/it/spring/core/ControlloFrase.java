package it.spring.core;

import java.util.Arrays;
import java.util.List;

public class ControlloFrase {

	public int conteggioParole(String testo) {
		List<String> words = Arrays.asList(testo.split(""));
		return words.size();
	}
	
	public int conteggioVocali(String testo) {
		
		char[] array = testo.toCharArray();
		int counterVoc = 0;
		List<String> vocali = Arrays.asList("a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y");
		for (char lettera : array) {
			if(vocali.contains(lettera)) {
				counterVoc++;	
			}
		}return counterVoc;
	}
	
	public int conteggioConsonanti(String testo) {
		
		char[] array = testo.toCharArray();
		int counterCons = 0;
		List<String> vocali = Arrays.asList("a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "Y");
		for (char lettera : array) {
			if(!vocali.contains(lettera)) {
				counterCons++;	
			}
		}return counterCons;
	}
}
