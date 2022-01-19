// Week 2 Lab Question 2
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] numbers = new float [3];
        float sum = 0;
        System.out.print("Enter three numbers: ");
        String inputString = input.next();
        if (inputString.matches(" ")){
            String[] stringArray = inputString.split(" ");
            for(int i = 0; i < stringArray.length; i++){
                numbers[i] = Float.parseFloat(stringArray[i]);
            }
        }
        else{
            numbers[0] = Float.parseFloat(inputString);
            numbers[1] = input.nextFloat();
            numbers[2] = input.nextFloat();
        }
        System.out.print("The average of ");
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            System.out.printf("%.1f ", numbers[i]);
        }
        System.out.printf("is %.1f\n", sum / 3);
        input.close();
    }
}
