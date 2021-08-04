/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gits_studyindependen;

import java.util.Scanner;

/**
 *
 * @author Juli Omoshiroi
 */
public class main {
     public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String pilih = null;
        boolean jalan = true;
        while (jalan == true) {
            System.out.println("silahkan pilih nomor dari pertanyaan");
        System.out.println("nomor 1");
        System.out.println("nomor 2");
        System.out.println("nomor 3");
        System.out.println("nomor 4");
        System.out.println("nomor 5");
        System.out.println("(input angka 6 jika ingin keluar program");
        System.out.println("pilihan anda :");
        pilih = key.nextLine();
        if (pilih.equalsIgnoreCase("1") || pilih.equalsIgnoreCase("nomor 1")) {
            System.out.print("masukan angka :");
            int data = key.nextInt();
            no_1.s(data);
        } else if (pilih.equalsIgnoreCase("2") || pilih.equalsIgnoreCase("nomor 2")) 
        {
            String data = key.next();
            no_2.dua(data);
        } else if (pilih.equalsIgnoreCase("3") || pilih.equalsIgnoreCase("nomor 3")) 
        {
            no_3.nomortiga();
        } else if (pilih.equalsIgnoreCase("4") || pilih.equalsIgnoreCase("nomor 4")) 
        {
            System.out.print("masukan kata = ");
            String data = key.nextLine();
            no_4.nomorempat(data);
        } else if (pilih.equalsIgnoreCase("5") || pilih.equalsIgnoreCase("nomor 5")) 
        {
            System.out.print("masukan kata = ");
            String data = key.nextLine();
            no_5.nomorlima(data);
            
        } else if (pilih.equalsIgnoreCase("6") || pilih.equalsIgnoreCase("nomor 6")) 
        {
                jalan = false;
                System.out.println("Terima Kasih, nama saya Farid Kharisudin");
        }
  
      }    
     }

}
