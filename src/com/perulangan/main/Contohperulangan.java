package com.perulangan.main;
import java.util.Scanner;

public class Contohperulangan {
	public static void main(String[] args) {
		
	
	boolean running = true;
	int counter = 0;
	String jawab;
	Scanner scan = new Scanner(System.in);
	
	while(running) {
		System.out.println("Apakah anda ingin keluar dari aplikasi ini ? ");
		System.out.println("Jawab [ya/Tidak] ");
		
		jawab = scan.nextLine();
		
		if(jawab.equalsIgnoreCase("ya")) {
			running = false;
		}
		counter++;
	}	
	System.out.println("Anda telah melakukan pengulangan sebanyak " + counter + " kali" );
	}
	
}
