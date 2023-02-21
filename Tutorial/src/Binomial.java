import java.util.Scanner;
import java.lang.Math;

public class Binomial {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("n = number of trials; k= number of passes; p = probability of pass");
        System.out.print("Enter n> ");
        int n = input.nextInt();
        System.out.print("Enter k> ");
        int k = input.nextInt();
        System.out.print("Enter p> ");
        double p = input.nextDouble();
        System.out.println(GetBinomial(n,k,p));
    }

    // chances of k successes in n
    public static double GetBinomial(int n, int k, double p){
        int nCk = Permutation_Combination.Combination(n,k);
        return nCk*Math.pow(p,k)*Math.pow(1-p,n-k);
    }
}
