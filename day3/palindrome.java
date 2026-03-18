import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int num=0;
        while(n!=0){
            num=num*10+n%10;
            n/=10;
        }
        if(temp==num){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
