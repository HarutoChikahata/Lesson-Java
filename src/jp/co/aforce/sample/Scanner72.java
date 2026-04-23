package jp.co.aforce.sample;

import java.util.Scanner;

public class Scanner72 {
	public static void main(String[] agrs) {
		//1.インスタンスの作成
		Scanner sc = new Scanner(System	.in);
		
		//2.整数として受け取る
		System.out.print("整数を入力してください：");
		int num = sc.nextInt();
		
		//3.ifで判定するんや
		if(num > 0) {
			System.out.println("正の数です。");
		} else if (num < 0) {
			System.out.println("負の数です。");
		} else {
			System.out.println("0です。");
		}
		//4.しっかり閉じる
		sc.close();
	}
}
