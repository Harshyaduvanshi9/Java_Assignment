package java_pr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Java_Q1 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            numbers.add(i);
        }

        
        Collections.shuffle(numbers);

       
        System.out.println("Shuffled Array: " + numbers);

	}

}
