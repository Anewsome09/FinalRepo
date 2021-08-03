package com.anthoney.test;


import com.anthoney.datastructures.List;

public class TestList {

	public static void main(String[] args) {
		List list = new List();
		list.set(0, "Apple");
				
		System.out.println(list.get(0));
		
		int index = list.add("Carrot");

		System.out.println(index);
		System.out.println(list.get(index));
		
		list.add("Canteloupe");
        list.add("Dragonfruit");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeyberry");
        list.add("Jujube");

        String value = list.remove();
        System.out.println(value);
		System.out.println(list.get(5));
        
        value = list.remove();
        System.out.println(value);
	}
	
	
}
