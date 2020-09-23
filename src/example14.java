import java.util.Scanner;

public class example14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter purchase anount: ");
        double purchaseAmount=input.nextDouble();
        double tax=purchaseAmount*0.06;
        System.out.println("Sales tax is $"+(int)(tax*100)/100.0);
    }
}
