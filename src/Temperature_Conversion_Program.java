import java.util.Scanner;

public class Temperature_Conversion_Program {
    public  static double celsiusToFahrenheit(double celsius){
            double fahrenheit =(9.0/5)*celsius +32;
        return fahrenheit;
    }
    public  static double fahrenheitTocelsius(double fahrenhrit){
        double celsius =(5.0/9)*(fahrenhrit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double fahrenhrit1;
        double celsius1 ;
        int choice;

        do{
            System.out.println("Menu");
            System.out.println("1: Fahrenheit to Celsius");
            System.out.println("2 :  Celsius to Fahrenheit");
            System.out.println("0: Exit");
            System.out.println("Enter your choice");
            choice =sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit");
                    fahrenhrit1 =sc.nextDouble();
                   double result = fahrenheitTocelsius(fahrenhrit1);
                    System.out.println("Fahrenheit to Celsius:" +result);
                case 2 :
                    System.out.println("Enter Celsius");
                    celsius1 =sc.nextDouble();
                    result = celsiusToFahrenheit(celsius1);
                    System.out.println("Fahrenheit to Celsius:" +result);

            }

        }while (choice !=0);

    }

}
