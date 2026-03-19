import java.util.Scanner;
public class Main{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.print(arr[j]+" ");
            }
        }
    }
}
}

// n=5  
// arr=[1,2,3,2,1]

// 1:
//   i=0 , arr[0]=1
//   j=0+1=1 ( arr[1]=2)
//     1==2(false)
//   j=1+1=2 ( arr[2]=3)
//     1==3 (false)
//   j=2+1=3  (arr[3]=2)
//     1==2 (false)
//   j=3+1=4 (arr[4]=1)
//     1==1 (true) 
//     print 1

// 2:
//   i=1 , arr[1]=2
//   j=1+1=2 (arr[2]=3)
//     2==3 (false)
//   j=2+1=3 (arr[3]=2)
//     2==2 (true)  
//     print 2
//   j=3+1=4 (arr[4]=1)
//     2==1 (false)

// 3:
//   i=2 , arr[2]=3
//   j=2+1=3 (arr[3]=2)
//     3==2 (false)
//   j=3+1=4 (arr[4]=1)
//     3==1 (false)

// 4:
//   i=3 , arr[3]=2
//   j=3+1=4 (arr[4]=1)
//     2==1 (false)

// 5:
//   i=4 → arr[4]=1
//   no j loop
//   so loop stops
