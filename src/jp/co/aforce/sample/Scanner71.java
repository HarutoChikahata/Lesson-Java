package jp.co.aforce.sample;

import java.util.Scanner;

public class Scanner71 {
	public static void main(String[] args) {
		//1.インスタンスの作成
		Scanner sc = new Scanner(System.in);
		//2.文字列として受け取る
		System.out.print("お名前は？ > ");
		String name = sc.next();
		//3.整数として受け取る
		System.out.print("年齢は？ > ");
		int age = sc.nextInt();
		
		System.out.println(name + "さんは、" + age + "歳なんですね");
		
		sc.close();
		
	
		        Scanner sc1 = new Scanner(System.in);
		        
		        System.out.print("整数を入力してください: ");
		        int num = sc1.nextInt();
		        
		        if (num % 2 == 0) {
		            System.out.println(num + " は偶数です。");
		        } else {
		            System.out.println(num + " は奇数です。");
		        }
		        
		        sc1.close();
		    }
		
	
		
	

}

