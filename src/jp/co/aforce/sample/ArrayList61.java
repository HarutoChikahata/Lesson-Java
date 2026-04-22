package jp.co.aforce.sample;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList61 {
	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		Collections.reverse(numbers);
		
		System.out.println("逆順のリスト" + numbers);
	}

}
