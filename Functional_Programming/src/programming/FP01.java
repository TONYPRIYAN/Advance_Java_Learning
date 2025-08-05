package programming;

import java.util.List;

public class FP01 {

	public static void main(String[] args) {
		
		//printall(List.of(1,2,3,4,5,6,7));
		//printeven(List.of(1,2,3,4,5,6,7,8,9,10));
		//specificCourse(List.of("Java","Python","API","Spring"));
		CourseChars(List.of("Java","Python","API","Spring"));
	}
	
//	private static boolean iseven(int num)
//	{
//		return num % 2 == 0;
//	}
	
	
	
	
	private static void printall(List<Integer> list)
	{
		//Structured
//		for(int x : list)
//		{
//			System.out.println(x);
//		}
		
		list.stream()
				.forEach(System.out::println);
		
	}
	
	private static void printeven(List<Integer> list)
	{
	
		
		list.stream()
				.filter(num -> num%2 > 0)
				.forEach(System.out::println);
		
	}
	
	private static void specificCourse(List<String> list)
	{
		list.stream()
			.filter(course -> course.equals("Spring")).
			forEach(System.out::println);
	}
	private static void CourseChars(List<String> list)
	{
		list.stream()
			.filter(course -> course.length() >= 4).
			forEach(System.out::println);
	}

}
