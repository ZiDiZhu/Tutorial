public class Permutation_Combination {

    public static void main(String[] args){
        System.out.println(Combination(5,1));
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
