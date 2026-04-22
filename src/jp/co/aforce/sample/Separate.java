package jp.co.aforce.sample;
	//問5
public class Separate {
	public static void main(String[] args) {
		// 1.小数の変数numに7.8を代入
		double num = 7.8;
		
		// 2.整数部分を取り出す
		int intPart = (int) num;
		
		// 3.小数部分を計算する（元の値から整数部分を引く）
		double doublePart = num - intPart;
		
		// 4.それぞれ表示
		System.out.println("整数部分" + intPart);
		System.out.println("小数部分" + doublePart);
		
	}

}
