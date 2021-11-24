package com.casting.main;
import java.util.Scanner;

public class Casting {
	public static void main(String args[]) {
	//Automatic
	int a =20;
	double b = a;			
	char e = 'B';
	long z = 9223372036854775000l;
	int int_data = e;
	//Manual
	byte c = 87;
	byte C = 69;
	char d = (char) c;
	char D = (char) C;
	int Z = (int) z;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Coba input casting : "); 
	int cobainput = input.nextInt();
	double hasil = cobainput;
	System.out.println("Hasil casting int ke double :  "+ hasil);
	System.out.println("A : "+ a);
	System.out.println("Casting B : "+ b);
	System.out.println("Casting C : "+ d+D);
	System.out.println("Casting D : "+ int_data);
	System.out.println("Casting Z : "+ Z);
	
	
	}
}