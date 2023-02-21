import java.util.Scanner;

public class Permutation_Combination {

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println(Combination(5,1));
        System.out.println("n= number elements; k=numbers of chosen items");
        System.out.print("Enter n >");
        int n = input.nextInt();
        System.out.print("Enter k >");
        int k = input.nextInt();
        System.out.println("combinations: "+Combination(n,k));
        System.out.println("permutations: "+Permutation(n,k));
    }

    public static int Combination(int n,int r){
        return factorial(n)/(factorial(n-r)*factorial(r));
    }

    public static int Permutation(int n,int r){
        return factorial(n)/factorial(n-r);
    }

    public static int factorial(int n){
        int f = 1;
        for(int i = n; i>1;i--){
            f *=i;
        }
        return f;
    }
}
