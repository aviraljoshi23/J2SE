package SubSaturday;

class NumberPatterns
{
	public static void Pa()
	{
		int a=6,b=0;
		for(int i = 1;i<=6;i++)
		{
			if(i%2!=0)
			{
			    for(int j = 1;j<=a;j++)
				{
					System.out.print(j);
				}
			    b=a-1;
			}
			else
			{
				for(int k=b;k>=1;k--)
				{
					System.out.print(k);
				}
				 a=b-1;
			}
			System.out.println();
		}
	}
// 3u
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

class StarPatterns
{
	public static void HollowInvertedMirroredRtriangle()
	{
		for(int i = 0;i<=10;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=10;j>=i;j--)
			{
				if(i==0||i==10||j==10||j==i)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void HollowMirroredRtriangle()
	{
		for(int i = 1;i<=10;i++)
		{
			for(int k=10;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(i==10||j==i||j==10||j==1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void HollowInvertedRtriangle()
	{
		for(int i = 0;i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				if(i==0||i==10||j==10||j==i)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void HollowSquaredStar()
	{
		for(int i = 1;i<=9;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if(j==1||i==9||i==1||j==8)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public static void HollowRhombusStar()
	{
		for(int i = 1;i<=9;i++)
		{
			for(int k=8;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=8;j++)
			{
				if(j==1||i==9||i==1||j==8)
				{
					System.out.print(" * ");
				}
				else if(i==4)
				{
					System.out.print("------Rhombus------*");
					break;
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	
	public static void HollowMirroredRhombus()
	{
		for(int i = 1;i<=9;i++)
		{
			for(int k = 1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=8;j++)
			{
				if(j==1||i==9||i==1||j==8)
				{
					System.out.print(" * ");
				}
				else if(i==4)
				{
					System.out.print("------Rhombus------*");
					break;
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public static void HollowRight()
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1||i==6|j==1||j==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void HollowPyramid()
	{
		for(int i = 1;i<=8;i++)
		{
			for(int k = i;k<=8;k++)
			{
				System.out.print(" ");
			}
			for(int j =1;j<=(2*i-1);j++)
			{
				if(j==1||i==8||j==(2*i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
	public static void PyramidStar()
	{
		for(int i = 1;i<=8;i++)
		{
			for(int k = i;k<=8;k++)
			{
				System.out.print(" ");
			}
			for(int j =1;j<=(2*i-1);j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
	}
	public static void InvertedPyramid()
	{
		for(int i = 1;i<=8;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("-");
			}
			for(int j=16;j>(2*i-1);j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void HollowInvertedPyramid()
	{
		for(int i = 1;i<=8;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=16;j>(2*i-1);j--)
			{
				if(j==16||i==1||i==(j-i))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void DiagonalStarPattern()
	{
		for(int i = 1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j==1||i==9||i==1||j==9||i==j||i==10-j)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	public void PlusStarPattern()
	{
		for(int i = 1;i<=7;i++)
		{
			for(int j =1;j<=7;j++)
			{
				if(j==4||i==4)
				{
					System.out.print("+");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
public class PatternsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StarPatterns sp = new StarPatterns();

	}

}
