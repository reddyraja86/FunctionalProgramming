package Programming;

import java.util.IntSummaryStatistics;
import java.util.List;
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
		
		Integer val = numbers.stream().map(num -> (num*num)).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(val);
		
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
