package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	int multiply = num1*num2;
    	String multi = num1+" x "+num2+" = "+ multiply;
        return multi;
    }
    public static boolean isPrime(int primeNumber) {
    	for(int i = 2; i<primeNumber; i++) {
    		if(primeNumber%i == 0) {
    			return false;
    			
    		}
    	}
    	return true;
    }
    public static boolean isSquare(int square) {
    	for(int i = 0; i<=square; i++) {
    		if(i*i == square) {
    	    	return true;

    		}
    	}
    	return false;
    }
    
	public static boolean isCube(int cube) {
		for(int i = 0; i<=cube; i++) {
			if(i*i*i == cube) {
				return true;
			}
		}
		return false;
	}

    
    public static int findBrokenEgg(List<String> eggs) {
    	
    		return eggs.indexOf("cracked");
    	

    }
	public static Object countPearls(List<Boolean> oysters) {
		int temp = 0;
		for(int i = 0; i<oysters.size(); i++) {
			if(oysters.get(i) == true) {
				temp +=1;
			}
			
		}
		return temp;
	}
	public static double findTallest(List<Double> peeps) {
		double max = 0;
		for(int i = 0; i<peeps.size(); i++) {
			if(peeps.get(i) > max) {
				max = peeps.get(i);
			}
		}
		return max;
	}
	public static Object findLongestWord(List<String> words) {
		int max = 0;
		int temp = 0;
		for(int i = 0; i<words.size(); i++) {
			if(words.get(i).length() > max) {
				max = words.get(i).length();
				temp = i;
			}
		}
		return words.get(temp);
	}
	public static Object containsSOS(List<String> message1) {
		for(int i = 0; i<message1.size(); i++) {
			if(message1.get(i).equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	public static List<Double> sortScores(List<Double> results) {
		for(int i = 0; i<results.size(); i++) {
			for(int j = 0; j<results.size()-1; j++) {
				if(results.get(j) > results.get(j+1)) {
					 Double temp = results.get(j);
	                    results.set(j, results.get(j + 1));
	                    results.set(j + 1, temp);
				}
			}
		}
		return results;
	}
	public static Object sortDNA(List<String> unsortedSequences) {
		for(int i = 0; i<unsortedSequences.size(); i++) {
			for(int j = 0; j<unsortedSequences.size()-1; j++) {
				if(unsortedSequences.get(j).length() > unsortedSequences.get(j+1).length()) {
					String temp = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(j+1));
					unsortedSequences.set(j+1, temp);
					
				}
			}
		}
		return unsortedSequences;
	}
	public static List<String> sortWords(List<String> words) {
		for(int i = 0; i<words.size(); i++) {
			for(int j = 0; j<words.size()-1; j++) {
				if(words.get(j).charAt(0) > words.get(j+1).charAt(0)) {
					String temp = words.get(j);
					words.set(j, words.get(j+1));
					words.set(j+1, temp);
				}
			}
			
		}
		return words;
	}



}
