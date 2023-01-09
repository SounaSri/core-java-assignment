import java.util.Scanner;
import java.util.Scanner;
import java.util.Stack;

public class test3 {
    public static void main(String args[]){
        Stack<String> sr = new Stack<String>();
        boolean result = sr.empty();
        Scanner sc=new Scanner(System.in);
        boolean n=true;
        while(n){
            System.out.println("enter your name");
            String name = sc.nextLine();
            sr.push(name);
            if(sr.size()==4){
                n=false;
            }
        }
        System.out.println("most recently visited data");
        System.out.println(sr.pop());
    }
}

