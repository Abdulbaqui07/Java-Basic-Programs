public class checkalphabet {
    public static void main(String[] args) {
        char ch = '*';
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
          System.out.println(ch + " is an alphabet.");
        else
          System.out.println(ch + " is not an alphabet.");
    }
}

//using ternary operator
/*
char c = 'A';
String output = (c>='a' && c<='z')||(c>='A' && c<='Z')
    ? c + " is an alphabet" : c + " is not an alphabet";
System.out.println(output);
*/   