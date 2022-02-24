package Programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP02FunctionalInterface {

	public static void main(String args[]) {
		functionalInterfacesExamples(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}
	
	private static void functionalInterfacesExamples(List<Integer> numbers) {
        /** Implementation 
			numbers.stream()
			.filter(i->i%2==0)
			.map(i->i*i)
			.forEach(System.out :: println);
		*/
		
		/** PREDICATE EXAMPLE */
		Predicate<Integer> predicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer i) {
				return i%2==0;
			}
		};
		/** FUNCTION */
		Function<Integer, Integer> fucntion = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				
				return t*t;
			}
		};
		
		/** CONSUMER */
		
		Consumer< Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
					System.out.println(t);
			}
		};
		
		numbers.stream()
		.filter(predicate)
		.map(fucntion)
		.forEach(consumer);
	}

	
	

}
