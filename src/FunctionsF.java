import java.util.*;

public class FunctionsF{

     public static void printFactorial(int n){
//loop
         if(n<0){
             System.out.println("Invalid Number");
return;
         }
         int Factorial = 1;

         for(int i=n; i>=1; i--){
             Factorial= Factorial*i;

         }

         System.out.println(Factorial);
         return;
     }

    public static void main(String args[]) {
         Scanner sc= new Scanner(System.in);
         int n = sc.nextInt();
         printFactorial(n);

    }
}
