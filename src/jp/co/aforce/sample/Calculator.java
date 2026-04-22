package jp.co.aforce.sample;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // --- 問3: 面積の計算 ---
        int width = 7;
        int height = 4;
        int area = width * height;
        System.out.println(area);
        // --- 問4: データ型の問題 ---
         String name = "Java";
         double version = 17.0;
         boolean isFun = true;
         System.out.println(name);
         System.out.println(version);
         System.out.println(isFun);
         
         Scanner sc = new Scanner(System.in);
        
         System.out.print("名前を入力してください:");
         String userName = sc.next();
         System.out.println("こんにちは," + userName + "さん！");
         
         sc.close();
    }
}