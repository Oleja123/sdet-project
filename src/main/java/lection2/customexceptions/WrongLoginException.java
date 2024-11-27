package lection2.customexceptions;

public class WrongLoginException extends Exception{
    public WrongLoginException(){}
    public WrongLoginException(String message){
        super(message);
    }
}
