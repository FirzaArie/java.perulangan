package com.i.main;
import java.util.Scanner;
public class If {
public static void main(String[] args) {
	System.out.println("MENU");
	System.out.println("1. NEW");
	System.out.println("2. CONTINUE");
	System.out.println("3. LOAD");
	
	Scanner input = new Scanner(System.in);
	System.out.println("Masukan input : "); 
	int a = input.nextInt();
	
	switch(a) {
	case 1:
		System.out.println("NEW");
		break;
	case 2:
		System.out.println("CONTINUE");
		break;
	case 3:
		System.out.println("LOAD");
		break;
	default:
		System.out.println("No Menu");
	}
}
}
