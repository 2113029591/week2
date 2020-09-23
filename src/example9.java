import java.util.Scanner;

public class example9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number for radius:");
        double number1=input.nextDouble();
        double number2=input.nextDouble();
        double number3=input.nextDouble();
        double arerage=(number1+number2+number3)/3;
        System.out.println("The average of"+number1+" "+number2
                +" "+number3+" is "+arerage);

    }
}
