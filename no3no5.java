import java.util.LinkedList;
import java.util.Scanner;

public class no3no5 {
    public static void main(String [] args){
        int input=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number:");
        input=sc.nextInt();
        LinkedList<Integer> arr=new LinkedList<Integer>();
        for (int i = 0; i < input; i++) {
            if((i+1)%15==0){
                arr.add(i+1);
            }else if((i+1)%3 != 0 && (i+1)%5 != 0){
                arr.add(i+1);
            }
        }
        System.out.println(arr.toString());
    }

}
