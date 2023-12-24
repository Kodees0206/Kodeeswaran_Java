package Q3;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {

		
		ArrayList<Integer> array = new ArrayList<>();

		// insert
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);

		
		List<Integer> oddNumbers = array.stream().filter(temp -> temp % 2 != 0).toList();

		
		List<Integer> squareNumbers = oddNumbers.stream().map(temp -> temp * temp).toList();

		//  sum of those squares
		int sum = squareNumbers.stream().mapToInt(temp -> temp).sum();

		// Print
		
		System.out.println("INPUT : " + array);
		System.out.println("ODD NUMBERS : " + oddNumbers);
		System.out.println("SQUARE NUMBERS : " + squareNumbers);
		System.out.println("SUM : " + sum);

	}

}
