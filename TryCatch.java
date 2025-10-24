class TryCatch{
    public static void main(String args[]){
        int a = 10;
        int b = 0;

        try {
            int ans = a / b;
            System.out.println("answer: " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}