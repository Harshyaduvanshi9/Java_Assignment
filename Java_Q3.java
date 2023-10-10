package java_pr;

import java.util.Scanner;

public class Java_Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a sentence to check if it's a pangram: ");
        String sentence = sc.nextLine();
        sentence = sentence.replaceAll(" ", "").toLowerCase();

       
        boolean[] alphabetPresent = new boolean[26];

        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetPresent[ch - 'a'] = true;
            }
        }

      
        boolean isPangram = true;
        for (boolean alphabet : alphabetPresent) {
            if (!alphabet) {
                isPangram = false;
                break;
            }
        }

      
        if (isPangram) {
            System.out.println("It is a Pangram.");
        } else {
            System.out.println("It is not a Pangram.");
        }
	}

}
