import java.net.SocketPermission;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); /// create a Scanner Object
        System.out.println("Enter Name");

        String userName = myObj.nextLine();
        System.out.println("User Name is" + userName);
        
    }
}
