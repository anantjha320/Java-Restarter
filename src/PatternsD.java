import java.util.*;

public class PatternsD {
    public static void main(String args[]) {
        int n = 6;
        // outer loop
        for (int i=1; i<=n; i++) {
            // inner loop -> Space print
            for (int j = 1; j <= n-i; j++) {

                System.out.print(" ");
            }
            // inner loop -> Star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




