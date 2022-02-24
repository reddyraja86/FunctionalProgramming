package Programming;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FP01Functional {

	public static void main(String args[]) {
		printTheListOfNumberFunctionalApproach(List.of(1,2,3,4,5));
		
		printEventNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		exercises(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}
	
	private static void exercises(List<Integer> numbers) {

		System.out.println("  --- Exercise 1 ---");
		System.out.println("Print Only Odd Numbers from the List");
		
		numbers.stream().filter((num) -> (num%2!=0)).forEach(System.out::println);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		System.out.println("  --- Exercise 2 ---");
		System.out.println("Print All Courses individually\r\n"
				+ "\r\n"
				+ "List<String> courses = List.of(\"Spring\", \"Spring Boot\", \"API\" , \"Microservices\", \"AWS\", \"PCF\",\"Azure\", \"Docker\", \"Kubernetes\")");
		
		courses.stream().forEach(System.out::println);
		
		System.out.println("  --- Exercise 3 ---");
		System.out.println("Print Courses Containing the word \"Spring\"");
		
		courses.stream().filter((course) -> (course.contains("Spring"))).forEach(System.out::println);
		
		System.out.println("Exercise 4\r\n"
				+ "Print Courses Whose Name has atleast 4 letters");
		
		courses.stream().filter((course) -> (course.length()>=4)).forEach(System.out::println);
		
		System.out.println("Exercise 5\r\n"
				+ "Print the cubes of odd numbers");
		
		numbers.stream().filter((num) -> (num%2!=0))
					.map(num -> num*num*num)
					.forEach(System.out::println);

		System.out.println("Exercise 6\r\n"
				+ "Print the number of characters in each course name");
		courses.stream().map((course) -> (course.length())).forEach(System.out::println);
		
		System.out.println("Exercise 7\r\n"
				+ "Square every number in a list and find the sum of squares");
		
		int sum =numbers.stream().map(n->n*n).reduce(0,Integer::sum);
		
		System.out.println(sum);
		
		System.out.println("Exercise 8\r\n"
				+ "Cube every number in a list and find the sum of cubes");
		
		int C_sum = numbers.stream().map(n->n*n*n).reduce(0, Integer::sum);
		
		System.out.println(C_sum);
		
		System.out.println("Exercise 9\r\n"
				+ "Find Sum of Odd Numbers in a list");
		
		
		int o_sum = numbers.stream().filter(n->n%2!=0).reduce(0, Integer::sum);
		System.out.println(o_sum);
		
		System.out.println("Exercise 10\r\n"
				+ "Create a List with Even Numbers Filtered from the Numbers List");
		
		numbers.stream().filter(n->n%2==0).forEach(System.out::println);
		
		System.out.println("Exercise 11\r\n"
				+ "Create a List with lengths of all course titles.");
		
		List<Integer> coursesLength =courses.stream().map(n->n.length()).collect(Collectors.toList());
		
		coursesLength.stream().forEach(System.out::println);
		
		
		System.out.println("Exercise 12\r\n"
				+ "Find Functional Interface behind the second argument of reduce method. Create an implementation for the Functional Interface.\r\n"
				+ "\r\n"
				+ "int sum = numbers.stream() .reduce(0, Integer::sum);");
		
		BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
			
		};
		int s1= numbers.stream().reduce(0,binaryOperator);
		int s2 = numbers.stream() .reduce(0, Integer::sum);
		System.out.println(s1 + " " + s2);
		
	}

	private static boolean isEven(int num) {
		return num%2==0;
	}

	private static void printEventNumbers(List<Integer> numbrs) {
		// TODO Auto-generated method stub
		System.out.println("======PRINT EVEN NUMBERS========");
		numbrs.stream()
					//	.filter( FP01Functional::isEven)   
						.filter( (num) ->  num%2==0 )  //Using Lamda
						.forEach(System.out::println);
		
		
		numbrs.stream().filter( (num) -> (num>4)).forEach(System.out::println);
		
		
		
	}

	private static void printTheListOfNumberFunctionalApproach(List<Integer> numbers) {
		
		
	//	numbers.stream().forEach(FP01Functional::printMe);
		numbers.stream().forEach(System.out :: println);
	//	numbers.stream().forEach( i -> System.out.println(i));
		
		
		
	}
	
	public static void printMe(int i) {
		System.out.println(i);
	}
}
