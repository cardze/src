import java.util.Scanner;

public class flipString_b {
    public static void flipstr(String temp){
        String b="";
        for (int i = 1; i <= temp.length(); i++) {
            b+=temp.charAt(temp.length()-i);
        }
        System.out.println(b);
    }
    public static void main (String [] args){
        //data
        String a="",b="";
        //code
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String you want to flip");
        a=sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' '){
                flipstr(a.substring(0,i));
            }
        }
    }
}
