package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
		//問題１．定数名TAXを作成し、消費税率を代入し、コンソールに出力しなさい。
		double TAX = 0.1;
		System.out.println(TAX);
		
		//問題２．int型の変数 x に480を代入し、小数を格納するデータ型の変数priceに x とTAXの積を代入し、コンソールに商品の税込み金額のpriceの値を表示しなさい。
		int X = 480;
		double price = X * TAX;
		System.out.println(price);
		
		//問題３．文字を格納するデータ型の変数nameを作成し、自分の名前を代入し、コンソールに出力しなさい。
		String name = "近畑晴斗";
		System.out.println(name);
		
		//問題４．文字を格納するデータ型の変数を２つ作成し、"この商品の値段は" と "円です"の文字列をそれぞれ代入し、　"この商品の値段はprice（問題２で表示した変数）円です"とコンソールに表示しなさい。
		String messageA = "この商品の値段は";
		String messageB = "円です";
		System.out.println(messageA + price + messageB);		
	}
}