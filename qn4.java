import java.io.*;
import java.util.*;

public class qn4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scan.nextInt();
        int zodiacKey = year % 12;
        String[] zodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox",
                "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        System.out.println(zodiac[zodiacKey]);
    }
}
