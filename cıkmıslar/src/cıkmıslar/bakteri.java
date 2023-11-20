/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cıkmıslar;

/**
 *
 * @author ahmet
 */
public class bakteri {
    public static void main(String[] args) {
        double pop=500;
        int ay=1;
        while(pop<5000){
            pop=pop*1.05;
            System.out.println(pop);
            ay++;
        }
        System.out.println("Sonuç:"+ay);
    }
    
}
