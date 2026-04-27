package jp.co.aforce.sample;

class Cirle {
	double radius;
	
	//1.コンストラクタ：半径をセットする
	Circle(double radius){
		this.radius = radius;
	}
	//面積を計算して表示するメソッド
	void showArea() {
		//公式：面積=π × 半径の2乗
		double area = Math.PI * radius * radius;
		System.out.println("半径" + radius + "の円の面積：" + area);
	}
}
