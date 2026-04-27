package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeTest3 {
	public static void main(String[] args) {
		//問題１．文字列型の配列を利用し、商品データを全て格納しなさい。
		String[] items = {"シャープペンシル","ボールペン","リングノート", "クリップ","消しゴム"};
		
		//問題２．問題１で作成した配列を使って、コンソールに「ボールペン」と出力しなさい。
		System.out.println(items[1]);
		
		//問題３．適当なコレクションを利用し、社員データを全て格納しなさい。
		List<String> employees = new ArrayList<>();
		employees.add("山田太郎");
		employees.add("鈴木花子");
		employees.add("佐藤二郎");
		employees.add("山田太郎");
		employees.add("高橋三郎");
		
		//問題５．問題３で作成したコレクションから佐藤二郎をコンソールに出力しなさい。
		System.out.println(employees.get(2));
		
		//問題６．以下のArrayList2つを一つのリストに統合し、昇順に並び替え、拡張forを使用して要素全てをコンソールに出力しなさい
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
        list1.add(15);
        list1.add(16);
        list1.add(19);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(18);
        list2.add(20);
        
        list1.addAll(list2);
        Collections.sort(list1);
        for (Integer num : list1) {
        	System.out.print(num);
        }
        
		//問題７．問題６と以下のリストを使用する。　　統合（マージ）を使用せずに２つのリストを昇順でコンソールに出力しなさい。
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(13);
        list3.add(14);
        list3.add(17);
        list3.add(21);
        
        int i = 0; 
        int j = 0; 

        while (i < list1.size() || j < list3.size()) {
            if (i < list1.size() && (j == list3.size() || list1.get(i) <= list3.get(j))) {
                System.out.print(list1.get(i) + " ");
                i++;
            } else {
                System.out.print(list3.get(j) + " ");
                j++;
            }
        }
	}
}
