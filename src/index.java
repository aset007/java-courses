import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double result;
        try {
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Введите а : ");
                int a = reader.nextInt();
                System.out.println("Введите b : ");
                int b = reader.nextInt();
                System.out.println("Введите оперцию + / * -: ");
                String opr = reader.next();
                Calculator calculator = new Calculator();
                System.out.println("-----------------------");
                result = calculator.opr(a, b, opr);
                System.out.println(result);
                System.out.println("exit : yes/no ");
                exit = reader.next().toLowerCase();
            }
        } finally {
            reader.close();
        }
    }

}
