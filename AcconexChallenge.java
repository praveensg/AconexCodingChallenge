package com.acconex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AcconexChallenge {

	Map<String,Integer> fruitList = new HashMap<String,Integer>();
	Map<Integer,List<String>> dictionaryMap = new HashMap<Integer,List<String>>();
	
    public void loop() {
    	defaultDictionary();
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        String result = "";
        while (scanner.hasNextLine()) {
           String input = scanner.nextLine();
           result = fruitShopCalculator(input);
            
            System.out.println( "  -> " + result);
    		System.out.print( "> ");
        }
    }

	private void defaultDictionary() {
		List<String> abc = new ArrayList<String>();
		abc.add("A");
		abc.add("B");
		abc.add("C");
		List<String> def = new ArrayList<String>();
		def.add("D");
		def.add("E");
		def.add("F");
		List<String> ghi = new ArrayList<String>();
		ghi.add("G");
		ghi.add("H");
		ghi.add("I");
		List<String> jkl = new ArrayList<String>();
		jkl.add("J");
		jkl.add("K");
		jkl.add("L");
		List<String> mno = new ArrayList<String>();
		mno.add("M");
		mno.add("N");
		mno.add("O");
		List<String> pqrs = new ArrayList<String>();
		pqrs.add("S");
		pqrs.add("R");
		pqrs.add("Q");
		pqrs.add("S");
		List<String> tuv = new ArrayList<String>();
		tuv.add("T");
		tuv.add("U");
		tuv.add("V");
		List<String> wxyz = new ArrayList<String>();
		wxyz.add("W");
		wxyz.add("X");
		wxyz.add("Y");
		wxyz.add("Z");
		
		dictionaryMap.put(2, abc);
    	dictionaryMap.put(3, def);
    	dictionaryMap.put(4, ghi);
    	dictionaryMap.put(5, jkl);
    	dictionaryMap.put(6, mno);
    	dictionaryMap.put(7, pqrs);
    	dictionaryMap.put(8, tuv);
    	dictionaryMap.put(9, wxyz);
	}

    public static void main(String[] args) {
        new AcconexChallenge().loop();
    }
    
    public String fruitShopCalculator(String input) {
		
    	if(fruitsMap.containsKey(input)){
    		if("Cherries".equalsIgnoreCase(input) && fruitList.containsKey(input)){
    			sum = (fruitList.get(input) % 2 == 0)?(sum-20) + fruitsMap.get(input) :sum + fruitsMap.get(input);
    			fruitList.put(input, fruitList.get(input)+1);
    			return sum;
    		} else {
    			fruitList.put(input, 2);
    			return sum + fruitsMap.get(input);
    		}
    		
		} else {
			 System.out.println("Please enter a valid fruit name");
			 return sum;
		}
	}
    

}
