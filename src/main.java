import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Start with the code below and create a program that will output the sum, product, and average of num1 and num2. If the calculated sum is over 200, print an asterisk next to the sum.
        //  Bonus: If the calculated sum is under 1000, it should have a tilde (~) printed next to it.
        double num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();
        double sum = num1 + num2;
        double product = num1 * num2;
        double average = (num1 + num2) / 2;
        System.out.println("The product is " + product);
        System.out.println("The average is " + average);
        if (sum < 1000 && sum > 200){
            System.out.println("The sum is " + sum + "*~");
        }
        else if (sum < 1000){
            System.out.println("The sum is " + sum + "~");
        }
        else if (sum > 200){
            System.out.println("The sum is " + sum + "*");
        }
    }

}

