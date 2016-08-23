package com.java.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class DictionaryAsMap {
	
	static 	Map<String, String> dictionary = new HashMap<String, String>();
	
	//Dictionary of words
	public static void dictionary(String word, String meaning) {
		if (dictionary.containsKey(word)) {
			if (!dictionary.get(word).toString().equalsIgnoreCase(meaning)) {
				dictionary.replace(word, meaning);
			}
		}
		else 
			dictionary.put(word, meaning);
	}
	
	
public static void printDictionary() {
	Set<String> setD = dictionary.keySet(); 
	for (Iterator<String> itr = setD.iterator(); itr.hasNext();) {
		String key = (String) itr.next();
	 	String value = (String) dictionary.get(key);
	 	System.out.println(key + " : " + value);
    }
}


public static void main(String args[]) {

	String[][] arrayOfWordsAndMeanings = {
			{"take", "carry or bring with one"},
			{"jump", "move suddenly and quickly in a specified way"},
			{"walk", "an act of traveling or an excursion on foot"},
			{"run", "an act or spell of running"},
			{"dance", "move in a quick and lively way"},
			{"help", "serve someone with"},
			{"run", "an act or spell of running"}
			};
	for (int i=0; i<arrayOfWordsAndMeanings.length; i++) {
		dictionary(arrayOfWordsAndMeanings[i][0], arrayOfWordsAndMeanings[i][1]);
	}
	
	printDictionary();
}

}

