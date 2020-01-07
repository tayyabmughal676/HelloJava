import java.util.ArrayList;
import java.util.Scanner;

public class CalculaterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String oper;

        System.out.println("Available Operations :\n");
        System.out.println("+\t--> Addition\n-\t--> Substraction\n/\t--> Division\n*\t--> Multiplication\nmod\t--> Modulas\nLarge Or Small Num \t--> los");

        System.out.println("\nEnter Operator : ");
        oper = scanner.nextLine();
        Calculater calc = new Calculater();

        switch (oper.toLowerCase()){
            case "+":
                System.out.println("Enter Number 1 : ");
                num1 = scanner.nextDouble();

                System.out.println("Enter Number 2 : ");
                num2 = scanner.nextDouble();


                System.out.println("Addition : " + calc.addition(num1, num2));
                break;

            case "-":
                System.out.println("Enter Number 1 : ");
                num1 = scanner.nextDouble();

                System.out.println("Enter Number 2 : ");
                num2 = scanner.nextDouble();

                System.out.println("Addition : " + calc.substraction(num1, num2));
                break;

            case "/":
                System.out.println("Enter Number 1 : ");
                num1 = scanner.nextDouble();

                System.out.println("Enter Number 2 : ");
                num2 = scanner.nextDouble();

                System.out.println("Addition : " + calc.division(num1, num2));
                break;

            case "*":
                System.out.println("Enter Number 1 : ");
                num1 = scanner.nextDouble();

                System.out.println("Enter Number 2 : ");
                num2 = scanner.nextDouble();

                System.out.println("Addition : " + calc.multiplication(num1, num2));
                break;

            case "mod":
                System.out.println("Enter Number 1 : ");
                num1 = scanner.nextDouble();

                System.out.println("Enter Number 2 : ");
                num2 = scanner.nextDouble();

                System.out.println("Addition : " + calc.modulas(num1, num2));
                break;

            case "los":
                System.out.println("Enter how many numbers to input");
                int inp = scanner.nextInt();

                Double[] arr = new Double[inp];

                for(int i=0; i<arr.length; i++){
                    System.out.println("Enter Num " + i + " : ");
                    arr[i] = scanner.nextDouble();
                }

                ArrayList<Double> res = calc.findLargeAndSmall(arr);
                System.out.println("Small Number : " + res.get(0));
                System.out.println("Large Number : " + res.get(1));
        }
    }
}
