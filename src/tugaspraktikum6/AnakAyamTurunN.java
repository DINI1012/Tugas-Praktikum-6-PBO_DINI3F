/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum6;

/**
 *
 * @author DINI
 */
public class AnakAyamTurunN {
    public void cetakAnakAyamTurun(int n) {
        System.out.println("Lagu 'Anak Ayam Turun " + n + "':");
        for (int i = n; i > 0; i--) {
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            }
        }
    }
}



