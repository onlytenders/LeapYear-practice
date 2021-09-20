import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year in yyyy format");
        int year = scan.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("The number of days is 366");
        } else {
            System.out.println("The number of days is 365");
        }
    }
}