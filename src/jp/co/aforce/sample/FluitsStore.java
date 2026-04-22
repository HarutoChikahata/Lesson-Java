package jp.co.aforce.sample;
import java.util.HashMap;
import java.util.Map;

public class FluitsStore {
	public static void main(String[] args) {
		//1.お店のデータを準備
		Map<String,Integer> fruitMap = new HashMap<>();
		fruitMap.put("りんご",100);
		fruitMap.put("みかん",80);
		fruitMap.put("バナナ",120);
		fruitMap.put("いちご",300);
		
		//2.お客さんが買う果物を変数で設定
		String target = "ドリアン";
		
		//3.登録されいるかここで確認して表示
		if(fruitMap.containsKey(target)) {
			//登録している場合
			int price = fruitMap.get(target);
			System.out.println(target + "の値段は" + price + "円です。");
		} else {
			//登録されてない場合
			System.out.println("申し訳ありませんが、その商品は取り扱っておりません");
		}
		
	}
}
