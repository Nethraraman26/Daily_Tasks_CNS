import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int max=0;
        int start=0;
        for (int i=0;i<str.length();i++) {
            for (int j=start;j<i;j++) {
                if (str.charAt(j)==s.charAt(i)) {
                    start=j+1;
                    break;
                }
            }
            int length =i-start+1;
            if (length>max) {
                max=length;
            }
        }
        System.out.println(max);
    }
}

// str="abcabcbb"
// start=0
// max=0
// 1:
//   i=0,str[i]=a
//   j=0
//   0<0(false)
//   length=0-0+1
//         =1
//     max=1

// 2:
//   i=1,str[i]=b
//   j=0
//   0<1(true)
//   a==b(false)
//   length=1-0+1
//         =2
//     max=2

// 3:
//   i=2,,str[i]=c
//   j=0
//   0<2
//   a==c(false)
//   1<2
//   j=1
//   b==c(false)
//   length=2-0+1
//         =3
//     max=3

// 4:
//   i=3,str[i]=a
//   j=0
//   a==a(true)
//   start=0+1
//        =1
//   length=3-1+1
//         =3
//     max=3

// 5:
//   i=4,str[i]=b
//   j=1
//   b==b(true)
//   start=1+1
//        =2
//   length=4-2+1
//          =3
//   length=4-2+1
//          =3
//       max=3

// 6:
//   i=5,str[i]=c
//   j=2
//   c==c(true)
//   start=2+1
//        =3
//   length=5-3+1
//          =3
//       max=3

// 7:
//   i=6,str[i]=b
//   j=3
//   a==b(ffalse)
//   j=4
//   b==b(true)
//   start=4+1
//        =5
//   length=6-5+1
//         =3
//       max=3

// 8:
//   i=7,str[i]=b
//   j=5
//   c==b{false}
//   j=6
//   b==b(true)
//   stsrt=6+1
//        =7
//   length=7-7+1
//         =1
//   max=3  

  
