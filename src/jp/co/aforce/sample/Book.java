package jp.co.aforce.sample;

	
class Book{
	String title;
	String author;
	int price;
	//1.フィールド（データ）の作成
	
	void showInfo() {
		//2.メソッドの挿入
		System.out.println("Title:" + title);
		System.out.println("Author:" + author);
		System.out.println("Price:" + price + "円");
	}
}


