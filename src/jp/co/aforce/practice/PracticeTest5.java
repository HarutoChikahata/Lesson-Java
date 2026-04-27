package jp.co.aforce.practice;

import java.util.Random;

public class PracticeTest5 {
	public static void main(String[] args) {
		//問題１．int型の変数fortuneに乱数を代入し、fortuneの値を表示し、その値によって以下のメッセージがそれぞれ出力されるようにしなさい。
		Random random = new Random();
        int fortune = random.nextInt(5) + 1;
        
        System.out.println("fortuneの値: " + fortune);
        switch (fortune) {
            case 1:
                System.out.println("吉です");
                break;
            case 2:
                System.out.println("中吉です");
                break;
            case 3:
                System.out.println("大吉です");
                break;
            default:
                System.out.println("凶です");
                break;
        }
		//問題２. １～100までの整数の中で7の倍数を出力し、出力した7の倍数全てをカンマ区切りでコンソールに出力しなさい。
		//問題３．以下の画像のように九九がコンソールに出力されるプログラムを作成しなさい。
		//問題４．問題３の表は1の段から開始している。変数num×変数numから始まる九九の表を作成しなさい。
		//問題５．社員のリストemployeesと提出者のリストsubmittersがある。このリストを使用し、未提出者をコンソールに出力しなさい。
		//問題６．Forとifを使用し、1~100までの数の中から素数を出力しなさい。
	}

}
