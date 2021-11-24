package com.flow.main;
import java.util.Scanner;
public class Percabangan {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Menu : ");
	System.out.println("1. Persegi Panjang ");
	System.out.println("2. Segitiga");
	int menu = input.nextInt();
	switch(menu) {
		case 1:
			System.out.println("Pilih hitungan yang akan diterapkan : ");
			System.out.println("1. Luas ");
			System.out.println("2. Keliling");
			int persegi = input.nextInt();
			switch(persegi) {
			case 1 :
				System.out.println("Masukkan panjang :");
				int panjang = input.nextInt();
				System.out.println("Masukkan Lebar :");
				int lebar = input.nextInt();
				int hasil = panjang * lebar;
				System.out.println("Hasil Luasnya : " +hasil);
			break;
			case 2 :
				System.out.println("Masukkan panjang :");
				int panjangk = input.nextInt();
				System.out.println("Masukkan Lebar :");
				int lebark = input.nextInt();
				int hasilp = panjangk + lebark;
				System.out.println("Hasil Luasnya : " +hasilp);
			break;
			}
			break;
		case 2:
			System.out.println("Pilih hitungan yang akan diterapkan : ");
			int segitiga = input.nextInt();
			System.out.println("1. Luas ");
			System.out.println("2. Keliling");
			switch(segitiga) {
			case 1 :
				System.out.println("Masukkan panjang :");
				int panjang = input.nextInt();
				System.out.println("Masukkan Lebar :");
				int lebar = input.nextInt();
				int hasil = panjang * lebar / 2;
				System.out.println("Hasil Luasnya : " +hasil);
			break;
			case 2 :
				System.out.println("Masukkan panjang :");
				int panjangk = input.nextInt();
				System.out.println("Masukkan Lebar :");
				int lebark = input.nextInt();
				int hasils = panjangk + lebark;
				System.out.println("Hasil Keliling : " +hasils);
			break;

	
			}
			break;
	default:
		
	break;
	}

		
}
}