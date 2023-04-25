import java.util.*;

public class PlayingCat{
    public static boolean isCatPlaying(boolean summer, int temperature){
        int upperLimit = (summer)?45:35;
        return(temperature >= 25 && temperature <= upperLimit);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean summer = sc.nextBoolean();
        int temperature = sc.nextInt();
        boolean result = isCatPlaying(summer, temperature);
        System.out.println(result);
    }
}