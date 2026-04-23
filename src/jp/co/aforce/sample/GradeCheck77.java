package jp.co.aforce.sample;

import java.util.Scanner;

public class GradeCheck77 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("成績(A~F)を入力してください：");
		String lank = sc.next();
		
		switch(lank.toUpperCase()) {
		//toUpperCase→小文字で打っても大文字に変換してくれる
		case "A" : System.out.println("凄いやんか！"); break;
		case "B" : System.out.println("ま、頑張ったんちゃうん？"); break;
		case "C" : System.out.println("本当普通だね"); break;
		case "D" : System.out.println("かなりキツイ、指定校推薦は諦めて"); break;
		case "E" : System.out.println("お前はクラスでも指折りのタコ"); break;
		case "F" : System.out.println("最低の成績、呆れた"); break;
		}
		sc.close();
	}
 
}
