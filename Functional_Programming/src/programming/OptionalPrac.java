package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalPrac {

	public static void main(String[] args) {
		
		List<String> list = List.of("Java","Python","API","Spring","Spring Boot");
		
		Predicate<? super String> pred = x -> x.startsWith("S");
		Optional<String> opt = list.stream().filter(pred).findFirst();
		
		System.out.println(opt);
		System.out.println(opt.isEmpty());
		System.out.println(opt.isPresent());
		System.out.println(opt.get());
		

	}

}
