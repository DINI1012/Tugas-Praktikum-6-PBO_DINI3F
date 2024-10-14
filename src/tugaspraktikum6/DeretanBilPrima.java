
package tugaspraktikum6;

/**
 *
 * @author DINI
 */
public class DeretanBilPrima {
    // membuat deratan bilangan prima
    int n;
    public void cetakDeretanBilPrima(int n) {
        this.n=n;
        System.out.println("Bilangan Prima dari 0 - " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrima(i)) {
                System.out.println(i);
            }
        }
        // membuat deretan bilangan yang bukan prima
        System.out.println("\nBilangan Bukan Prima dari 0 - " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (!isPrima(i)) {
                System.out.println(i);
            }
        }
    }
    
    private boolean isPrima(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

