import java.util.Scanner;
public class test2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your month:");
        int mnt= sc.nextInt();
        System.out.println("enter your year:");
        int yr= sc.nextInt();
        if(mnt == 1 || mnt == 3 || mnt == 5 || mnt == 7 || mnt == 8 || mnt == 10 || mnt == 12){
            System.out.println("Number of days in 31");
        }else if((mnt == 2) && ((yr%400==0) || (yr%4 == 0 && yr%100!=0))){
            System.out.println("Leap year");
        }
        else if(mnt == 2)
        {
            System.out.println("Number of days is 28");
        }
        else {
            System.out.println("Number of days is 30");
        }
    }
}