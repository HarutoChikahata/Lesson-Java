package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList62 {
	public static void main(String[] args) {
		//重複のあるArrayListを作る
		List<String>list = new ArrayList<>();
		list.add("tokyo");
		list.add("nagoya");
		list.add("osaka");
		list.add("tokyo");
		list.add("chiba");
		
		System.out.println("元リスト:" + list);
		
		//2.ArrayListからHashSetに変換
		Set<String> set = new HashSet<>(list);
		
		//3,結果を表示
		System.out.println("重複削除後" + set);
		
	}
}
