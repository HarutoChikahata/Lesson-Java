package jp.co.aforce.sample;

class Employee{
		int id;
		String name;
		double salary;
		//2．データをセット
		Employee(int id, String name, double salary){
			this.id = id;
			this.name = name;
			this.salary = salary;
	}
		//3.給与を昇給させるメソッド
		void raiseSalary(double percent) {
			//Ex:5%Upならsalary = salary * 1.05
			this.salary = this.salary * (1 + percent / 100);
			System.out.println(name + "さんの給与が" + percent + "%アップしました");
			System.out.println(name+ "さんの昇給後の給与は" + this.salary + "円");
	}
}



