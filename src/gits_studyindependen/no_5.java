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
public class no_5 {
     public static void nomorlima(String kata) {
        String data = kata;
        int lengthkata = data.length();
        String[] arrkata = new String[1000];
        for (int i = 0; i < lengthkata;i++){
              int j = i;
              j++;
              arrkata[i] = data.substring(i,j);
           }
           String hasilkata = "";
        for (int i = lengthkata-1;i >= 0;i--){
              hasilkata = hasilkata+arrkata[i];       
           }
        Boolean ket;
         if (hasilkata.equalsIgnoreCase(data)){
            ket = true;
         } else {
             ket = false;
         }; 
         System.out.println(data +" dibalik "+hasilkata+" => Result "+ket);
         
     } 
}
