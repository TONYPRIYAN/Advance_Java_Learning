package programming;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Stream;

public class StreamPrac {

	public static void main(String[] args) {
		
		Map<String, Integer> map  = Map.of("a",1,"b",2,"c",3);
		
		Stream<String> keys = map.keySet().stream();
		Stream<Integer> values = map.values().stream();
		
		Stream<Map.Entry<String, Integer>> sets = map.entrySet().stream();
	}

}
