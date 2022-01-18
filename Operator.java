public class Operator{
    public static void main(String[] args){
        //declare variables
        double a = 5, b=6;
        int c=4;
        int var;
        //addition operator
        System.out.println("a + b = " + (a + b));
        //substraction operator
        System.out.println("a - b = " + (a - b));
        //multiplication operator
        System.out.println("a * b = " + (a * b));
        //division operator
        System.out.println("a / b = " + (a / b));
        //modulo operator
        System.out.println("a % b = " + (a % b));

        //assignment operator
        var = c;
        System.out.println("var using =: " + var);
        //+=
        var += c;
        System.out.println("var using += " + var);
        //*=
        var *= c;
        System.out.println("var using *= " + var);
    }
}