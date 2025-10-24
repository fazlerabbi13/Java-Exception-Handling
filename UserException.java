class MyException extends Exception{
    public MyException(String m){
        super(m);
    }
}

public class UserException{
    public static void main(String[] args) {
        try{
            throw new MyException("this is custom exception");
        }
        catch(MyException e){
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}