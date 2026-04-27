package jp.co.aforce.sample;

class Student{
	String name;
	int[] scores;
	
	void showAverage() {
		double sum = 0;
		for(int score : scores) {
			sum += score;
		}
		double average = sum / scores.length;
		System.out.println(name + "さんの平均点：" + average);
	}
}



