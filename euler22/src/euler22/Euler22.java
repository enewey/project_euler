package euler22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Euler22 {
	
	public static int getNameScore(String name) {
		int score = 0;
		for (int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			score += ((int)c) - 64;
		}
		return score;
	}
	

	public static void main(String[] args) {
		long total = 0;
		try {
			FileReader fr = new FileReader(new File("res\\p022_names.txt"));
			BufferedReader bf = new BufferedReader(fr);
			String namesString = "";
			
			while (bf.ready()) {
				namesString += bf.readLine();
			}
			
			String[] namesArr = namesString.split(",");
			
			ArrayList<String> names = new ArrayList<String>();
			for (int i=0; i<namesArr.length; i++) {
				names.add(namesArr[i].substring(1, namesArr[i].length()-1));
			}
			Collections.sort(names);
			
			for (int i=0; i<names.size(); i++) {
				total += (getNameScore(names.get(i)) * (i+1));
			}
			
		} catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
		System.out.println("Score of ABC: "+getNameScore("ABC"));
		System.out.println("Total: "+total);
		

	}

}
