/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berhitung;
import java.util.*;
/**
 *
 * @author GAMES
 */
public class Berhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Luas hitung = new Luas(); 
        
        Scanner input = new Scanner(System.in);
        
        int pilihan; 
        
        System.out.println("Bangun datar apa yang ingin anda hitung luasnya ? ");
        System.out.println("1.lingkaran");
        System.out.println("2.Persegi");
        System.out.print("masukan pilihan anda :");
        pilihan = input.nextInt();
        
        switch (pilihan){
            case 1:
            hitung.lingkaran();
            break; 
            case 2:
                hitung.persegi();
                break;
        }
        
        
         
        
                
         
    }
    
}
