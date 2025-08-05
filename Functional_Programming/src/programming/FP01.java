package programming;

import java.util.List;

public class FP01 {

	public static void main(String[] args) {
		
		printall(List.of(1,2,3,4,5,6,7));

	}
	
	private static void printall(List<Integer> list)
	{
		for(int x : list)
		{
			System.out.println(x);
		}
		
	}

}
