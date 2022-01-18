public class fibonacci{
    public static void main(String[] args){

        int n=10, firstterm = 0, secondterm = 1;
        System.out.println("Fibonacci series till "+ n + "terms:");

        for(int i = 1; i <= n; ++i){
            System.out.print(firstterm + ", ");

            //compute next term
            int nextterm = firstterm + secondterm;
            firstterm = secondterm; 
            secondterm = nextterm;
        }
    }
}