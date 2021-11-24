package com.juaracoding.main;

import java.text.DecimalFormat;

public class HelloWorld {
public static void main(String[] args) {
	String nama,kota_asal;
	int usia = 20;
	boolean var1,var2,var3;
	double nil = 7.5899;
	float nil2;
	char grade='A' ;
	nama="Firza";
	kota_asal="Surabaya";
	var1 = 10<9;
	var2 = 10>9;
	var3 = "a" == "a";
	nil = 7.5899455;
	nil2 = 7.5899455f;
	
	DecimalFormat df=new DecimalFormat("#.##");
	System.out.println("ID");
	System.out.println("Nama : " + nama);
	System.out.println("Kota Asal : " + kota_asal);		
	System.out.println("Usia : " + usia);
	System.out.println("Jawaban 1 : " + var1);
	System.out.println("Jawaban 2 : " + var2);
	System.out.println("Jawaban 3 : " + var3);
	System.out.println("Nilai     : " + nil);
	System.out.println("Pembulatan: " + df.format(nil));
	System.out.println("Nilai     : " + grade);
	System.out.println(String.format("%.3f",nil*100000));
	System.out.println(String.format("%.3f",nil2*100000));




}

}
