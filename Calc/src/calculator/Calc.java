package calculator;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args){
        int X;
        int Y;
        Scanner User_Input = new Scanner(System.in);
        System.out.println("Enter the Value of X");
        X = User_Input.nextInt();

        System.out.println("Enter the Value of Y");
        Y = User_Input.nextInt();

        int sub = X - Y;
        int add = X + Y;
        int mul = X * Y;
        int div = X / Y;

        System.out.println("The Result of Submission of X + Y = "+add);
        System.out.println("The Result of Subtraction of X - Y = "+sub);
        System.out.println("The Result of Multiplication of X * Y = "+mul);
        System.out.println("The Result of Subdivision3 of X / Y = "+div);


    }
}
