package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PracticeTast4 {
	public static void main(String[] args) {
		//問題１．下記４つの値を持つ、リストを作成しなさい
		List<String> animals = new ArrayList<>();
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
		
		//問題２．問題１で作成したリストを使って、下記の問題に答えなさい
		String myAnimal = "へび";
		if (animals.contains(myAnimal)) {
            System.out.println(myAnimal + "はリストに含まれています");
        } else {
            System.out.println(myAnimal + "はリストに含まれていません");
        }
		
		//問題３．下記の予定表を参考に、問題に答えなさい
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH) + 1; 
   
        switch (month) {
            case 1:
                System.out.println("冬物セール");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("春物を売る");
                break;
            case 5:
                System.out.println("春物セール");
                break;
            case 6:
            case 7:
                System.out.println("夏物を売る");
                break;
            case 8:
                System.out.println("夏物セール");
                break;
            case 9:
                System.out.println("秋物を売る");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬物を売る");
                break;
            default:
                System.out.println("不正な月です");
                break;
        }
    }
}


