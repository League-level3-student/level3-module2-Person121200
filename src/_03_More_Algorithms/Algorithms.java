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
    	for(int i = 0; i<square; i++) {
    		if(i*i == square) {
    			
    		}
    	}
    	return true;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
    }
}
