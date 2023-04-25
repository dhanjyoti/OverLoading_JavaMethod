import java.util.*;

public class PrintYears{
    public static String printYearsAndDays(long minutes){
        if(minutes<0){
            return "Invalid Value";
        } else {
            long years = minutes / (60 * 24 * 365);
            long days = (minutes % (60 * 24 * 365)) / (60 * 24);
            return minutes + " min = " + years + " y and " + days + " d";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long minutes = sc.nextLong();
        System.out.println(printYearsAndDays(minutes));
    }
}