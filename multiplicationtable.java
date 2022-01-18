import java.util.Scanner;
public class multiplicationtable{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = read.nextInt();
        int mult;
        for(int i=1; i<=10 ;i++){
            mult=num*i;
            System.out.printf("%d * %d = %d \n",num, i, mult);
        }
        // int i=1, num=7, mult;
        // while(i<=10){
        //     mult=num*i;
        //     System.out.printf("%d * %d = %d \n",num, i, mult);
        //     i++;
        // }
    }
}

