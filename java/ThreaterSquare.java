// package test;
import java.util.Scanner;


public class cfThreaterSquare {
    
    public static void main(String[] args){
        long n,m,a;

        // ---- craete Scanner instance
        Scanner sc  = new Scanner(System.in);

        // ----- Takes inputt from the user
        n   = sc.nextLong();
        m   = sc.nextLong();
        a   = sc.nextLong();

        // ----- Calculate how many of flagstones are needed to cover it
        long horzFlagstones     = n / a;
        long vertFlagstones     = m / a;

        // ----- check, is there any uncover area!
        if (n % a != 0) {
            horzFlagstones++;
        }

        if (m % a != 0) {
            vertFlagstones++;
        }

        long flagstones = horzFlagstones * vertFlagstones;

        // ----- Print out the number of flagstones.
        System.out.println(flagstones);

    }
}
