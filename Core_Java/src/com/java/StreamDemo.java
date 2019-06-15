package com.java;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(7);
		myList.add(18);
		myList.add(10);
		myList.add(24);
		myList.add(17);
		myList.add(5);
		System.out.println("Original list: " + myList);
		//Display only the odd values that are greater than 5.
       //Stream<Integer> minValue=myList.stream().filter( (n) -> (n % 2) == 1).filter((n) -> n > 5);
       Stream<Integer> minValue=myList.stream().filter(n -> n%2==1).filter(n -> n>5);	
       minValue.forEach(n -> System.out.println( n + ""));
	}

}
