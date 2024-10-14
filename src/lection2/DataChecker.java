package lection2;

import lection2.customexceptions.WrongLoginException;
import lection2.customexceptions.WrongPasswordException;

import java.util.Arrays;

public class DataChecker {
    private static char[] allowedSymbolsInLogin = ("abcdefghijklmnopqrstuvwxyz" +
            "0123456789_").toCharArray();
    private static char[] allowedSymbolsInPassword= ("abcdefghijklmnopqrstuvwxyz" +
            "0123456789_").toCharArray();
    private static int loginLength = 20;
    private static int passwordLength = 20;

    private static boolean checkSymbolInArray(char c, char[] arr){
        for(char w : arr){
            if(c == w)
                return true;
        }
        return false;
    }

    private static boolean checkSymbolsInLogin(String checkingString) {
        for (char c : checkingString.toLowerCase().toCharArray()) {
            if(!checkSymbolInArray(c, allowedSymbolsInLogin))
                return false;
        }
        return true;
    }

    private static boolean checkSymbolsInPassword(String checkingString) {
        for (char c : checkingString.toLowerCase().toCharArray()) {
            if(!checkSymbolInArray(c, allowedSymbolsInPassword))
                return false;
        }
        return true;
    }

    public static boolean checkData(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= loginLength)
                throw new WrongLoginException("Количество символов в логине превышает " + Integer.toString(loginLength - 1));
            if (!checkSymbolsInLogin(login))
                throw new WrongLoginException("В логине присутствуют недопустимые символы");
            if (password.length() >= passwordLength)
                throw new WrongPasswordException("Количество символов в пароле превышает " + Integer.toString(passwordLength - 1));
            if (!checkSymbolsInPassword(password))
                throw new WrongPasswordException("В пароле присутствуют недопустимые символы");
            if (!password.equals(confirmPassword))
                throw new WrongPasswordException("Пароли не совпадают");
        }
        catch(WrongLoginException | WrongPasswordException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
}
