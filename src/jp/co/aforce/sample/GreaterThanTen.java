package jp.co.aforce.sample;

public class GreaterThanTen {
	public static void main(String args[]) {
	//1．変数numに整数12を代入
	int num = 12;
	
	//2. numが10より大きいかどうかifで判定
	if(num > 10) {
		//条件が正しければ（true）実行される
		System.out.println("numは10より大きいです");
	} else {
		//条件が正しくない（false）時に実行される
		System.out.println("numは10以下です");
		}
	}
}