package vcs.lt.test;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		for (char c = 'a'; c <= 'z'; c++) {
			String symbol = ", ";
			
			if(c == 'z') {
				symbol = ". ";
			}
			System.out.print(c + symbol);
		}
		
		
	
	}
}
