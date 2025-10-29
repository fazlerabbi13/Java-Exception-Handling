class MyException extends Exception{
    public MyException(String m){
        super(m);
    }
}

public class voting{
    public static void vote(int age) throws MyException{
        if(age < 18){
            throw new MyException("eligible");
        }else{
            System.out.println("not");
        }
    }
}

class UserException{
    public static void main(String[] args){
        // try{
        //     throw new MyException("this is custom exception");
        // }
        // catch(MyException e){
        //     System.out.println("Caught");
        //     System.out.println(e.getMessage());
        // }

        int age;

        try {
            age =16;
            voting(age);
        } catch (Exception e) {
        }

    }
}