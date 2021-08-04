/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gits_studyindependen;

/**
 *
 * @author Juli Omoshiroi
 */
public class no_3 {
     public static void nomortiga(){
         String waktu ="12:00:00 AM";
    String[] kata = waktu.split(" ");
    String[] data = kata[0].split(":");
    int jam = Integer.parseInt(data[0]);
    String menit = data[1];
    //int detik = Integer.parseInt(data[2]);
    
    
    if (kata[1].equalsIgnoreCase("PM")) {
       if (jam >=1 && jam <= 12) {
         int jamKonversi =12 + jam;
         System.out.println(jamKonversi + ":" + menit);
       } else {
         System.out.println(jam + ":" + menit );
       }
       
    } else if (kata[1].equalsIgnoreCase("AM")) {
       if (jam >=1 && jam <= 12) {
         int jamKonversi =  12-jam;
         System.out.println("0"+jamKonversi + ":" + menit);
       } else {
          System.out.println(jam + ":" + menit );
       }
    }   
  }
}
