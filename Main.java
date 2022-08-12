import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Ievadi skaitli x");
        int x = scan.nextInt();

        System.out.println("Izvēlies matemātisko darbību + - * /");
        Scanner scan2 = new Scanner(System.in);
        String mat = scan2.nextLine();

        System.out.println("Ievadi skaitli y");
        int y = scan.nextInt();

       switch (mat) {
            case "+": {
                double a = x + y;
                System.out.println("Rezultāts = " + a);
                break;
            }
            case "-": {
               double b = x - y;
               System.out.println("Rezultāts = " + b);
               break;
            }
            case "*": {
               double c = x * y;
               System.out.println("Rezultāts = " + c);
               break;
           }
           case "/": {
               double d = (double)x / y;
               System.out.println("Rezultāts = " + d);
               break;
           }
            default: {
               System.out.println("Error");
               break;
           }
       }
    }
}

