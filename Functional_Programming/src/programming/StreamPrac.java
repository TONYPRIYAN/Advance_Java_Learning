package programming;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPrac {

	public static void main(String[] args) {
		
//		Map<String, Integer> map  = Map.of("a",1,"b",2,"c",3);
//		
//		Stream<String> keys = map.keySet().stream();
//		keys.forEach(System.out::println);
//		
//		
//		
//		Stream<Integer> values = map.values().stream();
//		values.forEach(System.out::println);
//		
//		Stream<Map.Entry<String, Integer>> sets = map.entrySet().stream();
//		sets.forEach(System.out::println);
		
		//Array to Streams
//		int[] num = {1,2,3,4,5,6,7};
//		IntStream arr = Arrays.stream(num);
//		arr.forEach(System.out::println);
		   
		//Stream Builder
//		Stream.Builder<String> builder = Stream.builder();
//		builder.add("Superman");
//		builder.add("Batman");
//		builder.add("Spiderman");
//		
//		Stream<String> superheros = builder.build();
//		superheros.forEach(System.out::println);
		
		//Stream Generate
//		Stream<Double> nums = Stream.generate(Math :: random).limit(10);
//		nums.forEach(System.out::println);
		
		List<Integer> list = List.of(1,2,3,4,5,3,4,5,2,7);
		
		//Intermediate
		//list.stream().distinct().forEach(System.out::println);
		//list.stream().sorted().forEach(System.out::println);
		
		//Terminal  
//		List<Integer> sq = list.stream().map(n -> n*n).collect(Collectors.toList());
//		System.out.println(sq);
//		
//		long count = list.stream().count();
//		System.out.print(count);
		
		
//		UnaryOperator<Integer> uno = x -> x*2;
//		System.out.print(uno.apply(4));
		
		    Predicate<Integer> predicate  = x -> x % 2 == 1;
		    
		    list.stream().filter(predicate).forEach(System.out::println);

		
		
	}

}
