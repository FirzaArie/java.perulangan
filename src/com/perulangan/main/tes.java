package com.perulangan.main;
import java.util.Scanner;
public class tes {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	boolean running = true;
	String keluar;
	int counter = 0;
	while (running) {
	System.out.println("Menu : ");
	System.out.println("1. Persegi Panjang ");
	System.out.println("2. Segitiga");
	System.out.println("3. Lingkaran");
	int menu = input.nextInt();

	switch(menu) {
		case 1 :
			System.out.println("Masukkan panjang :");
			int panjang = input.nextInt();
			System.out.println("Masukkan Lebar :");
			int lebar = input.nextInt();
			int hasil = panjang * lebar;
			System.out.println("Hasil Luasnya : " +hasil);
			
			System.out.println("Apakah anda ingin keluar ? ");
			keluar = input.next();
			if(keluar.equalsIgnoreCase("ya")) {
				running = false;
			}
			break;
		case 2 :
			System.out.println("Masukkan panjang :");
			int panjangs = input.nextInt();
			System.out.println("Masukkan Lebar :");
			int lebars = input.nextInt();
			int hasils = panjangs * lebars;
			System.out.println("Hasil Luasnya : " +hasils);
			
			System.out.println("Apakah anda ingin keluar ? ");
			keluar = input.next();
			if(keluar.equalsIgnoreCase("ya")) {
				running = false;
			}
			break;
		case 3 :
			System.out.println("Masukkan panjang :");
			int panjangl = input.nextInt();
			System.out.println("Masukkan Lebar :");
			int lebarl = input.nextInt();
			int hasill = panjangl * lebarl;
			System.out.println("Hasil Luasnya : " +hasill);
			
			System.out.println("Apakah anda ingin keluar ? ");
			keluar = input.next();
			if(keluar.equalsIgnoreCase("ya")) {
				running = false;
			}
			break;
	}
	}
}
}