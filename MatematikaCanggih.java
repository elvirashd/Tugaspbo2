/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;
//NAMA : ELVIRA SOLIKHA HADI ISLAMI
//NIM : 09040623057

/**
 *
 * @author ASUS
 */
public class MatematikaCanggih extends Matematika {
    public void modulus (double a, double b){
        double hasil = a % b;
        System.out.printf("%f mod %.2f = %.2f %n",a,b, hasil);
    }
    
    public void modulus (double a, double b, double c){
        double hasil = a % b % c;
        System.out.printf("%.2f mod %.2f mod %2.f = %.2f %n", a,b,c,hasil);
    }
    
}
