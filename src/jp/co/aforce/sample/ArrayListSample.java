package jp.co.aforce.sample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListSample {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4));
		System.out.println("1．リスト" + list);
		
		int secondElement = list.get(1);
		System.out.println("2. 取得したエレメント" + secondElement);
		
		
		list.remove(1);
		list.remove(2);
		list.add(2);
		list.add(5);
		list.add(6);
		System.out.println("3.加工後のリスト" + list);
		
		list.set(2,4);
		System.out.println("4.置き換えた後のリスト" + list);
		
		list.clear();
		System.out.println("5.全削除リスト" + list);
	}
	
}
