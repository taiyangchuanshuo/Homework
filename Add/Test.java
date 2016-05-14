package com.wsw.Add;

public class Test {
	public static void main(String[] args) {
		Test test1 = new Test();
		test1.Add();
	
	}

	public void Add() {
		int i = 0;
		int result = 0;
		while (true) {
			if (i > 10) {
				break;
			} else if (i % 2 != 0) {
				i++;
				continue;
			} else {
				result += i;
				i++;
			}

		}
		System.out.println(result);
		
	}

}
