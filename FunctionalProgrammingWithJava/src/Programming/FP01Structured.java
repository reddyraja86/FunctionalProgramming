package Programming;

import java.util.List;

public class FP01Structured {

	public static void main(String args[]) {
		printTheListOfNumberStructuralApproach(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		printEventNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

	private static void printEventNumbers(List<Integer> numbers) {
		System.out.println("======PRINT EVEN NUMBERS========");

		for (Integer num : numbers) {
			if (num % 2 == 0)
				System.out.println(num);
		}
	}

	private static void printTheListOfNumberStructuralApproach(List<Integer> numbers) {

		for (Integer num : numbers) {
			System.out.println(num);
		}

	}
}
