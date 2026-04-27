package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.List;

public class HairetsuList61 {
	public static void main(String[] args){
List<String>listP = new ArrayList<>();
listP.add("Asakusa");
listP.add("Oshiage");
listP.add("Shimbashi");

String[] array = listP.toArray(new String[0]);
for (String s : array) {
	System.out.println("配列：" + s);
	}
  }
}