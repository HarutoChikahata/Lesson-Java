package jp.co.aforce.sample;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class Collection {
	public static void main(String[] args) {
	List<Integer>numbers = new ArrayList<>(List.of(1,2,3,4));
	System.out.println("1．リスト" + numbers);
	
	int secondElement = numbers.get(1);
	System.out.println("2. 取得したエレメント " + secondElement);
	
	numbers.remove(1);
	numbers.remove(2);
	numbers.add(2);
	numbers.add(5);
	numbers.add(6);
	System.out.println("3.加工後のリスト" + numbers);
	
	numbers.set(2,4);
	System.out.println("4.置き換えた後のリスト" + numbers);
	
	numbers.clear();
	System.out.println("5.全削除リスト" + numbers);
	}	
}
