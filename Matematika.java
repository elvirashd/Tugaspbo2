/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author ASUS
 */
public class Matematika {
void pertambahan(int a, int b) {
        int hasil = a + b;
        System.out.println("hasil : " + hasil);
    }

    void pertambahan(double a, double b, double c) {
        double hasil = a + b + c;
        System.out.printf("hasil: %.2f%n", hasil);
    }

    void pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("hasil :" + hasil);
    }
    
    void pengurangan(double a, double b, double c) {
        double hasil = a - b - c;
        System.out.printf("hasil: %.2f%n", hasil);
    }
    
    void perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("hasil :" + hasil);
    }
    
    void perkalian(double a, double b, double c) {
        double hasil = a * b * c;
        System.out.printf("hasil: %.2f%n", hasil);
    }
    
    void pembagian(int a, int b) {
        int hasil = a / b;
        System.out.println("hasil :" + hasil);
    }
    
    void pembagian(double a, double b, double c) {
        double hasil = a / b / c;
        System.out.printf("hasil: %.2f%n", hasil);
    }
   
}

