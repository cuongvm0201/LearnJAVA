package vn.techmaster;

public class listNumber1 {
    public static void questFour1() {
        int n = 10;
        System.out.printf("10 số nguyên tố đầu tiên là:",n);
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrimeNumber(i)) {
                System.out.print(" "+i);
                count++;
            }
            i++;
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}