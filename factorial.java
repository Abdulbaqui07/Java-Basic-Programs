import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = read.nextInt();
        long fact = 1;
        for(int i=1;i<=num;++i){
            fact *= i;
        }
        System.out.printf("Factorial of %d = %d", num, fact);
    }
}

/* int i=1,fact=1;
while(i<=num){
    fact=fact*i;
    i++;
}
*/