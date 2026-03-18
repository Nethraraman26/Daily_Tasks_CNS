//validparanthesis using two pointers

import java.util.*;
public class Main{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine().toLowerCase().replace(" ","");
    int left=0;
    int right=str.length()-1;
    while(left<right)
      {
        if(str.charAt(left)!=str.charAt(right)){
          System.out.priintln("False");
          return;
        }
        left++;
        right--;
      }
    System.out.println("True");
  }
}

// input " a man a plan a canel panama"
// left=0;
// right=str.length()-1  - last index
// left++
// right--
  
// str = "madam"
// Iteration 1:

//     left = 0(m)
//     right = 4(m)
//     left<right
//       0<4
//       m==m

// Iteration 2:

//     left = 1(a)
//     right = 3(a)
//     left<right
//       1<3
//       a==a

// Iteration 3:

//     left=2
//     right=2
//     left<right
//       2<2
//       flase
//       loop stops

// madam is a valid palindrome
