package jp.co.aforce.sample;

import java.util.HashMap;
import java.util.Map;

public class HashMap6 {
	public static void main(String[] args) {
		//1.HashMapを作成（key:日本人メジャーリーガー、value:HR数）
		Map<String,Integer>map = new HashMap<>();
		map.put("大谷", 53);
		map.put("村上",44);
		map.put("鈴木", 36);
		
		//2.キーと値を表示
		System.out.println("問１：" + map + "HR");
		
		String target = "村上";
		if(map.containsKey(target)) {
			System.out.println("問2：" + target + "のHR数は" + map.get(target) +"本です。" );
		} else {
			System.out.println("問2：" + target + "のデータは登録されていません。");
		}
		
		map.put("岡本", 14);
		map.put("村上", 44);
		map.put("吉田", 16);
		map.put("ジャッジ", 58);
		
	System.out.println("問3：" + "重複を除いた結果" + map);

	}

}

