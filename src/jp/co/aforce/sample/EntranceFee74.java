package jp.co.aforce.sample;

import java.util.Scanner;

public class EntranceFee74 {
	public static void main(String[] args) {
		//1.インスタンスの作成
		Scanner sc = new Scanner(System.in);
		//2.整数として受け取る
		System.out.print("年齢を入力してください：");
		int age = sc.nextInt();
		//3.if文で判定する
		if(age <= 12) {
			System.out.println("12歳以下は無料です。");
		} else if(age <= 59) {
			//13歳以上かつ59歳以下
			System.out.println("入場料は1000円です。");
		} else {
			//60歳以上
			System.out.println("入場料は500円です。");
		}
		sc.close();
	}
}