import java.util.Scanner;

public class UserEntered {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Name, Age and salary");

        // string input
        String name = myObj.nextLine();

        // numerical value
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // output input by user
        System.out.println("Name:" + name);

        System.out.println("age:" + age);

        System.out.println("salary:" + salary);
    }
}
