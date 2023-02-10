import java.util.Scanner;
import java.lang.Math;

public class Driver {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String line; //user input
        String[] lineVectors; //words separated by comma
        double[] a ; //array of lineVectors
        double min,max,count;

        line = input.nextLine(); //read the entire line

        //separate all values by comma
        lineVectors = line.split(",");
        a= new double[lineVectors.length]; //declaring
        //parsing the values to Integer
        for(int i=0;i<a.length;i++){
            a[i] = Double.parseDouble(lineVectors[i]);
        }
        max = a[0]; // Initialize maximum element
        min = a[0];
        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] <min){
                min = a[i];
            }
        }

        //display
        System.out.println("Range: ["+min+","+max+"]"+"  Count:"+a.length);
        System.out.println("E(x)= " + meanValue(a)+ "   Standard Deviation: " +standardDeviation(a));
    }

    public static double sum(double[] x){
        double s =0;
        for(int i=0;i<x.length;i++){
            s +=x[i];
        }
        return s;
    }
    //the expected value, or the mean value
    public static double meanValue(double[] x){
        return sum(x)/(x.length);
    }

    public static double populationVariance(double[] x){
        double pv =0;
        double mu = meanValue(x);
        for(int i=0;i<x.length;i++){
            pv+=(x[i]-mu)*(x[i]-mu);
        }
        pv/=x.length;
        return pv;
    }

    public static double standardDeviation(double[] x){
        return Math.sqrt(populationVariance(x));
    }


}