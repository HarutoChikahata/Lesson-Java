package jp.co.aforce.sample;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
public class Main {
	public static void main(String[] args) {
		Person p = new Person("田中太郎",25);
		System.out.println("名前：" + p.name + ",年齢" + p.age);
	}

}
