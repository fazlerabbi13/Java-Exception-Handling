public class FinallyBlock {
public static void main(String[] args) {
    int[] number = {1,2,3,4};

    try {
        System.out.println(number[4]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("index out of bound");
    }
    finally{
        System.out.println("finally block always executes.");
    }

    // System.out.println("program running");
}
}
