// Week 2 Lab Question 1
import java.util.Scanner;

public class CircleArea{
    public static void main(String[] args) {
        double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        input.close();
        double area = radius * radius * PI;
        System.out.printf("The area for the circle of radius %f is %f\n", radius, area);
    }
}
