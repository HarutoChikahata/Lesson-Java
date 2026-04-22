package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayList63 {
	public static void main(String[] args) {
		//1.ArrayListを作成し、整数を追加
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(15);
		numbers.add(50);
		numbers.add(100);
		
		//2.特定の値（例：50）が含まれているか確認
		int target = 50;
		if(numbers.contains(target)) {
			System.out.println(target + "はリストに含まれます。");
		} else {
			System.out.println(target + "はリストに含まれていません。");
		}
	}
}
