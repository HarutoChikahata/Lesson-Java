package jp.co.aforce.sample;
import java.util.LinkedHashMap;
import java.util.Map;


public class HashMapSample {
	public static void main(String[] args) {
	Map<String,Integer> nameMap = new LinkedHashMap<>();
	
	nameMap.put("Bob",1);
	nameMap.put("Alice",2);
	nameMap.put("John",3); 
	nameMap.put("Tom",4);
	System.out.println("Map: " + nameMap);
	
	int value = nameMap.get("Tarou");
	System.out.println(value);
	
	

	}
}
