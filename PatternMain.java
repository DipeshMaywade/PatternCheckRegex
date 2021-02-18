import java.util.Scanner;

public class PatternMain {
    public static void main(String[] args) {
        PatternImplement checker = new PatternImplement();

        while (true) {
            System.out.println("Choose A Option B/W 1-4");
            Scanner obj = new Scanner(System.in);
            int option = obj.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter Your Pattern");
                    String pattern1 = obj.next();
                    checker.useCase1(pattern1);
                    break;
                case 2:
                    System.out.println("Enter Your Pattern");
                    String pattern2 = obj.next();
                    checker.useCase2(pattern2);
                    break;
                case 3:
                    System.out.println("Enter Your Pattern");
                    String pattern3 = obj.next();
                    checker.useCase3(pattern3);
                    break;
                case 4:
                    System.out.println("Enter Your Pattern");
                    String pattern4 = obj.next();
                    checker.useCase4(pattern4);
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;

            }
        }
    }
}
