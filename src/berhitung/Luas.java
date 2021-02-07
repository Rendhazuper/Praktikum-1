/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berhitung;
import java.util.Scanner;

/**
 *
 * @author GAMES
 */
public class Luas {
    Scanner input = new Scanner(System.in);
    
    double luas, phi =3.14;
    int r,s;
    
    void lingkaran(){
        System.out.print("masukan jari jari lingkaran : ");
        r = input.nextInt();
        
        luas = phi*r*r;
        
        
        System.out.print("hasilnya adalah = "+luas);
    }
    void persegi(){
        System.out.print("masukan sisi persegi : ");
        s = input.nextInt();
        
        luas = s*s;
        
        
        System.out.print("hasilnya adalah = "+luas);
    }
}
