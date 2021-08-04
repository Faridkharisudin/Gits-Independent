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
public class no_1 {
     public static void s(int data){
            int hasil = data;
            
            if (hasil % 3 == 0 && hasil % 5 == 0) {
                System.out.println("Hello World");
            }
            else if (hasil % 5 == 0) {
                System.out.println("World");
            }
            else if (hasil % 3 == 0) {
                System.out.println("Hello");
            } else {
                System.out.println("tidak bisa dibagi habis oleh 3 atau 5");
            }
        }       
}
