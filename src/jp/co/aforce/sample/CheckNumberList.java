package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class CheckNumberList {
	public static void main(String[] args) {
		//1.整数型の変数を作成
		int number = 20;
		//2.ArrayListを作成
		List<String>list = new ArrayList<>();
		//3.if文を使って判定
		boolean isLarge = number > 10;
		if(isLarge) {
			list.add("large");
		} else {
			list.add("small");
		}
		System.out.println(list);
	}

}
