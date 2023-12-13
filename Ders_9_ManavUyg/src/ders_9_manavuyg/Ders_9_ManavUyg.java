/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders_9_manavuyg;

import java.util.Scanner;

/**
 *
 * @author Barış Adsız
 */
public class Ders_9_ManavUyg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Kaç kg elma: ");
        int elmaKg = input.nextInt();
        double elmaFiyat = 20*elmaKg;
        
        System.out.print("Kaç kg armut: ");
        int armutKg = input.nextInt();
        double armutFiyat = 30*armutKg;
        
        System.out.print("Kaç kg portakal: ");
        int portakalKg = input.nextInt();
        double portakalFiyat = 35*portakalKg;
        
        double hesap = elmaFiyat + armutFiyat + portakalFiyat;
        System.out.println("Toplam: " + hesap);
    }
    
}
