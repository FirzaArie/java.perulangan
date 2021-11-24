//Jawaban No 3
package com.perulangan.main;
import java.util.Scanner;
public class Perulangan3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int tinggi,lebar;
	System.out.println("Masukkan nilai Tinggi :");
	tinggi = input.nextInt();
	System.out.println("Masukkan nilai Lebar :");
	lebar = input.nextInt();
	for(int i=1; i<=tinggi; i++) {
		for(int k=lebar; k>=i; k--) {
			System.out.print("  ");
		}
		for(int j=1; j<=i; j++) {
			System.out.print("* ");
		}
		System.out.println("");
	}
	
}
}