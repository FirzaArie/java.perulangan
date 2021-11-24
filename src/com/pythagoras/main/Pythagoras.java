package com.pythagoras.main;
import java.util.Scanner;

public class Pythagoras {
	public static void main(String args[]) {
		double c;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Coba input A : "); 
		int a = input.nextInt();
		double double_dataa=a;
		System.out.println("Coba input B : "); 
		int b = input.nextInt();
		double double_datab=b;
		c = double_dataa * double_dataa + double_datab * double_datab ;
		long hasil = (long) c;
		System.out.println("Hasil : " +Math.sqrt(hasil)); 
}
}