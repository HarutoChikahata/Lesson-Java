package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList64 {
	  public static void main(String[] args) {
		//1.ArrayListを作成、文字列追加
		List<String> swallows = new ArrayList<>();
		swallows.add("Osuna");
		swallows.add("Santana");
		swallows.add("Shiomi");
		swallows.add("Nagaoka");
		
		//2,アルファべット順にソート
		Collections.sort(swallows);
		
		//3.表示
		System.out.println("ソート後リスト" + swallows);
	}

}
