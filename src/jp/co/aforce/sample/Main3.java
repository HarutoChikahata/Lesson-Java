package jp.co.aforce.sample;

public class Main3{
	public static void main(String[] args) {
	Player p1 = new Player();
	Player p2 = new Player();
	
	System.out.println("初期状態");
	System.out.println("p1 HP=" + p1.hp1);
	System.out.println("p2 HP=" + p2.hp2);
	
	p1.hp1 -= 30;
	
	System.out.println("¥nダメージ後：");
	System.out.println("p1 HP=" + p1.hp1);
	System.out.println("p2 HP=" + p2.hp2);
	
	}
}