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

// n = 121
// temp = 121
// num = 0
// 1:
//     n = 121
//     num = num * 10 + (n % 10)  -(takes the last digit) 
//         = 0 * 10 + 1
//         = 1
//     n = n / 10  -(removes the last digit)
//       = 121 / 10
//       = 12

// 2:
//     num=1
//     n=12
//     num = num * 10 + (n % 10)
//         = 1 * 10 + 2
//         = 12
//     n = n / 10
//       = 12 / 10
//       = 1

// 3:
//     num=12
//     n=1
//     num = num * 10 + (n % 10)
//     = 12 * 10 + 1
//     = 121
//     n = n / 10
//       = 1 / 10
//       = 0

// n=0(so the loop ends)
    
