public class Calculator {
    static int a, b, opr;
    static double result;
    public double opr(int a, int b, String opr) {
        switch (opr) {
            case "+":
                result = a + b;
                break;
            case  "-":
                result = a - b;
                break;
            case  "/":
                result = a / b;
                break;
            case  "*":
                result = a * b;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
