package jp.co.aforce.sample;

import java.util.LinkedList;

public class LinkedList65 {
	public static void main(String[] args) {
		//1.LinkedListを作成、文字列を追加
		LinkedList<String>stations = new LinkedList<>();
		stations.add("Chiba");
		stations.add("Tudanuma");
		stations.add("Funabashi");
		stations.add("Ichikawa");
		
		System.out.println("最初：" + stations.getFirst());
		System.out.println("最後" + stations.getLast());
		
		
	}

}
