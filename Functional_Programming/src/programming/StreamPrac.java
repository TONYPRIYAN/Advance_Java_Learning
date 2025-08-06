package programming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
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
		Stream.Builder<String> builder = Stream.builder();
		builder.add("Superman");
		builder.add("Batman");
		builder.add("Spiderman");
		
		Stream<String> superheros = builder.build();
		superheros.forEach(System.out::println);
		
		
	}

}
