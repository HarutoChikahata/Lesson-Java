package jp.co.aforce.sample;

public class Cat1{
	String name;
	
	void meow() {
		System.out.println(name + "が鳴いた！" );
	}
	public static void main(String[] args) {
       Cat1 myCat = new Cat1();
       //インスタンス化
       myCat.name = "ムーン";
       //名前を設定
       myCat.meow();
       //メソッド呼び出し
    }
}