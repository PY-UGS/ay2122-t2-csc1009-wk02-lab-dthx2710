import java.io.*;
import java.util.*;

public class qn2 {
    static int size = 3;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] nums = new float[size];
        float total = 0;
        System.out.println("Enter three numbers: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextFloat();
            total += nums[i];
        }
        float average = total / nums.length;
        System.out.println(String.format("The average of %.1f %.1f %.1f is %.1f", nums[0], nums[1], nums[2], average));
    }
}