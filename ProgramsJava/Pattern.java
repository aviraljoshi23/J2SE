package ProgramsJava;
public class Pattern {
    public static void main(String []args){

// 3
// 44
// 555
// 6666
// 555
// 44
// 3
    /*for(int i = 3;i<=6;i++)
        {
            for(int j = 3;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    for(int i = 5;i>=3;i--)
    {
        for(int k=3;k<=i;k++)
        {
            System.out.print(i);
        }
        System.out.println();
    }*/
    /*for(int i=1;i<=4;i++)
    {
        a=0;
        for(int j=1;j<=i+a;j++)
        {
            if(j%2==0)
            {
                System.out.print("*");
                a++;
            }
            else{
                System.out.print(i);
            }
        }
        System.out.println();
    }
    int b=7;
    for(int i=4;i>=1;i--)
        {
            for(int j=b;j>=1;j--)
            {
                if(j%2==0)
                {
                    System.out.print("*");
                    b--;
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }*/
// 1
// 2*2
// 3*3*3
// 4*4*4*4
// 4*4*4*4
// 3*3*3
// 2*2
// 1
        /*for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j!=1)
                {
                    System.out.print("*"+i);
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }

        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(j!=1)
                {
                    System.out.print("*"+i);
                }
                else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }*/

         
//       1
//      232
//     34543
//    4567654
//   567898765
        /*for(int i = 1;i<=5;i++)
        {
            int b=i;
            for(int k=5;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print(b++);  
            }
            --b;
            for(int j=2;j<=i;j++)
            {
                System.out.print(--b);
            }
            System.out.println();
        }*/
    }
}
