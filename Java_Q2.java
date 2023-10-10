package java_pr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Q2 {

	public static void main(String[] args) {
		Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a  Valid Roman Number ");
        
        String romanNumeral = sc.nextLine().toUpperCase(); 

        int result = 0;
        int prevValue = 0;

        
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            char currentChar = romanNumeral.charAt(i);
            int currentValue = romanValues.get(currentChar);

           
            if (currentValue < prevValue) {
                result -= currentValue; 
            } else {
                result += currentValue;
                prevValue = currentValue;
            }
        }

     
        System.out.println("Integer Value: " + result);
	}

}
