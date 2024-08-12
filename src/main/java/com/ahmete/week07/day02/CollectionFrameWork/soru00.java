package com.ahmete.week07.day02.CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

/**
 * [16:20] Alperen Ikinci (BilgeAdam Boost) klasik foreach ile en az 3 katmanlısını yapalım.
 * <p>
 * [16:21] Alperen Ikinci (BilgeAdam Boost) collection.foreach ile 2 katmanliyi lambda expression formatinda yazalim ve
 * ayni ciktiyi alalim.
 */

public class soru00 {
	public static void main(String[] args) {
		Map<Integer,Map<Integer,String>> integerMapMap = new HashMap<>();
		Map<Integer,String> integerStringMap = new HashMap<>();
		integerStringMap.put(1,"Merhaba");
		integerStringMap.put(2,"Dunya");
		integerStringMap.put(3,"Ben");
		integerStringMap.put(4,"Uzaydan");
		integerStringMap.put(5,"Geliyorum.");
		
		Map<Integer,String> integerStringMap2 = new HashMap<>();
		integerStringMap2.put(1,"Ne");
		integerStringMap2.put(2,"Mutlu");
		integerStringMap2.put(3,"Turkum");
		integerStringMap2.put(4,"Diyene");
		
		integerMapMap.put(1,integerStringMap);
		integerMapMap.put(2,integerStringMap2);
		
		for (Map.Entry<Integer,Map<Integer,String>> upperMap: integerMapMap.entrySet()){
			System.out.println("Key : " + upperMap.getKey());
			System.out.println("UpperValue : ");
			for (Map.Entry<Integer,String> lowerMap: upperMap.getValue().entrySet()){
				System.out.println("Inner Key : " + lowerMap.getKey());
				System.out.println("Inner Value : "+ lowerMap.getValue());
			}
		}



       System.out.println(integerMapMap);
	}
}