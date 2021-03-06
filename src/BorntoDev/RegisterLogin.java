package BorntoDev;

import java.util.Scanner;

public class RegisterLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().replaceAll("name : ", "");
        String password = scanner.nextLine().replaceAll("password : ", "");
        String lName = scanner.nextLine().replaceAll("name\\(login\\) : ", "");
        String lPassword = scanner.nextLine().replaceAll("password\\(login\\) : ", "");
        if (name.equals(lName) && password.equals(lPassword)) System.out.println("Success");
        else System.out.println("Error");
    }

}
