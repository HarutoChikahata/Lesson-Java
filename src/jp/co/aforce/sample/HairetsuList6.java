package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HairetsuList6 {
	public static void main(String[] args){
		Integer[] array = {10,20,30,40,50};
		
		List<Integer>list = new ArrayList<>(Arrays.asList(array));
		
		System.out.println("リスト" + list);
		
    	
	}
	
}

