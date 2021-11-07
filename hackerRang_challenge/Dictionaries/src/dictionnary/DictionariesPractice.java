package dictionnary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionariesPractice {

	public static void main(String[] args) {
	Map<String,String> englSpanDictionary = new HashMap<String,String>();
	englSpanDictionary.put("Monday", "Lunes");
	englSpanDictionary.put("Tuesday", "Martes");
	englSpanDictionary.put("Wednesday", "Miercoles");
	englSpanDictionary.put("Thursday", "Jueves");
	englSpanDictionary.put("Friday", "Viernes");
	// Retrieve things from our dictionary
	System.out.println(englSpanDictionary.get("Monday"));
	System.out.println(englSpanDictionary.get("Tuesday"));
	System.out.println(englSpanDictionary.get("Wednesday"));
	System.out.println(englSpanDictionary.get("Thursday"));
	System.out.println(englSpanDictionary.get("Friday"));
	// Print out all keys
	System.out.println(englSpanDictionary.keySet());
	// Print out all value
	System.out.println(englSpanDictionary.values());
	// Print out all keys and value
	System.out.println(englSpanDictionary.toString());
	System.out.println(englSpanDictionary.isEmpty());
		
	
	}

}
