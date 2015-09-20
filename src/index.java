import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg : ");
                String first = reader.next();
                System.out.println("Enter second arg : ");
                String second = reader.next();
                System.out.println("exit : yes/no ");
                exit = reader.next().toLowerCase();
            }
        } finally {
            reader.close();
        }
    }
}
