import java.util.Scanner;
public class evenoddtern{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = read.nextInt();
        String evenodd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenodd);
    }
}