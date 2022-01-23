import java.io.*;
import java.util.*;

public class qn1 {
    static double pi = 3.14159;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius = scan.nextDouble();
        double area = radius * radius * pi;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}