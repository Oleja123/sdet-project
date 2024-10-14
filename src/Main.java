import lection2.DataChecker;

import java.util.Scanner;

public class Main {
    private static void checkLection2() {
        String login, password, confirmPassword;
        Scanner sc = new Scanner(System.in);
        login = sc.nextLine();
        password = sc.nextLine();
        confirmPassword = sc.nextLine();
        System.out.println(DataChecker.checkData(login, password, confirmPassword));
    }

    public static void main(String[] args) {
        checkLection2();
    }
}
