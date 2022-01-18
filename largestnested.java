public class largestnested{
    public static void main(String[] args){
        double a = -4.5, b = 3.9, c = 2.5;
        if(a >= b){
            if(a>= c)
                System.out.println(a + " a is greater");
            else
                System.out.println(c + " c is greater");
        }
        else{
            if(b>=c)
                System.out.println(b + " b is greater");
            else
                System.out.println(c + " c is greater");
        }
    }
}