import java.util.*;

public class EqualityPrinter{
    public static void printEqual(int a, int b, int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Value");
        } else if(a==b && b==c){
            System.out.println("All numbers are equal");
        } else if(a!=b & b!=c && a!=c){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal nor different");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        printEqual(a, b, c);
    }
}