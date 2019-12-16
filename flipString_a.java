import java.util.Scanner;

public class flipString_a {
    public static void main (String [] args){
        //data
        String a="",b="";
        //code
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String you want to flip");
        a=sc.nextLine();
        for (int i = 1; i <= a.length(); i++) {
            b+=a.charAt(a.length()-i);
        }
        System.out.println(b);
    }
}
