package jp.co.aforce.practice;

public class PracticeTest1 {
	public static void main(String[] args) {
		// 問題２．コンソールに“Hello World”と表示するプログラムを作成しなさい。
		System.out.println("Hello World");
		
		// 問題3．int 型の変数 x に数値 11 を代入し、コンソールに“x=11”のように表示するプログラムを作成しなさい。
		int x = 11;
		System.out.println("x=" + x);
		
		// 問題4．int 型の変数 y、z に数値 13、17 を代入し、y、z の値をコンソールに“y=13  z=17”のように表示するプログラムを作成しなさい。
		int y = 13;
		int z = 17;
		System.out.println("y=" + y + " z=" + z);
		
		// 問題5．int型の変数totalに、変数y、zの和を代入し、totalの値をコンソールに出力しなさい。
		int total = y + z;
		System.out.println("y+z=" + total);
		
		// 問題6．int型の定数を作成し（定数名は命名規則に沿ったものなら何でも良い、全て大文字）数値６を代入し、宣言しなさい。
		int THE_SIX = 6;
		
		// 問題7．int型の変数sumに、問題５で出力したtotalと問題６で宣言した定数の和を代入し、sumの値をコンソールに出力しなさい。
		int sum = total + THE_SIX ;
		System.out.println(sum);
	}
}