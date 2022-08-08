import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double fullKdvRatio = 0.18;
        double halfKdvRatio = 0.08;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount: ");
        double theAmount = scanner.nextInt();

        double amountWithFullKdv =  theAmount * fullKdvRatio;
        double amountWithHalfKdv = theAmount * halfKdvRatio;

        double amountScale = theAmount > 1000 ? amountWithFullKdv : amountWithHalfKdv;

        System.out.println("Your kdv ratio is : " + amountScale);



    }
}
