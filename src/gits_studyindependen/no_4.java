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
public class no_4 {
     public static void nomorempat(String data) {      
        String datakata = data;
        int lengthkata = datakata.length();
        String[] arrkata = new String[1000];
        for (int i = 0; i < lengthkata;i++){
              int j = i;
              j++;
              arrkata[i] = datakata.substring(i,j);
           }
        for (int i = lengthkata-1;i >= 0;i--){
              System.out.print(arrkata[i]);       
           }
        System.out.println();
     }    
}
