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
public class no_2 {
     String hasil;
        public static void dua(String data){
            String hasil = data;
            String[] arraykata = new String[100];
            int lengthkata = hasil.length();
            for (int i = 0;i < lengthkata; i++) {
                int j = i;
                j++;
                String hasilkata = hasil.substring(i,j);
                arraykata[i] = hasilkata;
                if (arraykata[i] == "@") {
                    
                }
            }            
        
        }
}
