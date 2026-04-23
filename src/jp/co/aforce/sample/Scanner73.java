package jp.co.aforce.sample;

import java.util.Scanner;

public class Scanner73 {
	public static void main(String[] args) {
		//1.インスタンスの作成
		Scanner sc = new Scanner(System.in);
		
		//2.整数として受け取る
		System.out.println("1辺目を入力してください");
		int a = sc.nextInt();
		System.out.println("2辺目を入力してください");
		int b = sc.nextInt();
		System.out.println("3辺目を入力してください");
		int c = sc.nextInt();
		
		//3.三角形の成立条件：a+b>c かつ(&&) a+c>b && b+c>a
		if(a+b>c && a+c>b && b+c>a ) {
			System.out.println("三角形として成立します。");
		} else {
			System.out.println("三角形として成立しません");
		}
		
		sc.close();
	}

}
