package jp.co.aforce.sample;
	//問3
public class EvenOrOdd {
	public static void main(String args[]) {
		// 1．変数numに整数7を代入
		int num = 7;
		
		// 2. numを2で割った「余り」が0かどうかで判定
		if(num % 2 == 0) {
			//余りが0なら偶数
			System.out.println(num + "は偶数です");
		} else {
			//余りが0以外なら奇数（2で割り切れないため）
			System.out.println(num + "は奇数です");
		}
	}

 }
