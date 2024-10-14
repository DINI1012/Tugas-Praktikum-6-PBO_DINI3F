/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author DINI
 */
public class TabelPerkaliannxn {
    int n;
    public void cetakTabelPerkaliannxn(int n) {
        this.n=n;
        if (n > 10) {
            System.out.println("Nilai n harus kurang dari atau sama dengan 10.");
            return;
        }   
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();       
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}


