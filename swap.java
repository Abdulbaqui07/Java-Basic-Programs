public class swap{
    public static void main(String[] args){
        float first=1.5f, second=2.0f;
        System.out.println("----Before Swap----");
        System.out.println("First number "+first);
        System.out.println("Second number "+second);
        // Value of first is assigned to temporary
        float temporary = first;
        // Value of second is assigned to first
        first = second;
        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;
        System.out.println("----After Swap----");
        System.out.println("First number "+first);
        System.out.println("Second number "+second);
    }
}