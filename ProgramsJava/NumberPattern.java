package ProgramsJava;
public class NumberPattern {
    public static void main(String []args){

// *****
// *   *
// *   *
// *   *
// *****
/*
        for(int i = 1;i<=5;i++)
        {
            for(int j =1;j<=5;j++)
            {
                if(j==1||i==5||j==5||i==1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */

    //      *  
    //     **  
    //      *  
    //      *  
    //    *****
        
    /*for(int i = 1;i<=5;i++)
        {
            for(int j =1;j<=5;j++)
            {
                if(j==3||i==2&&j==2||i==5)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

    //     * * *   
    //   *      *   
    //          *   
    //         *    
    //       *      
    //    **********
        /*for(int i = 1;i<=6;i++)
        {
            for(int j =1;j<=10;j++)
            {
                if(i==2&&j==2||i==1&&j==3||i==1&&j==5||i==1&&j==7||i==2&&j==7||i==3&&j==7||
                i==4&&j==6||i==6||i==5&&j==4)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

//  ******* 
//         *
//         *
//     *****
//         *
//         *
//  ******* 
        /*for(int i = 1;i<=7;i++)
        {
            for(int j =1;j<=10;j++)
            {
                if(j==10&&i==1||j==10&&i==7)
                {
                    System.out.print(" ");
                }
                else if(i==1&&j>2||i==4&&j>5||i==7&&j>2||j==10)
                {
                    System.out.print("*");;
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

    //      **    
    //     * *    
    //    *  *    
    //   *   *    
    //  ********  
    //       *    
    //       *
        /*for(int i = 1;i<=7;i++)
        {
            for(int j =1;j<=10;j++)
            {
                if(j==6&&i>=1||i==5&&j<9||j==6-i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        // *********
        // *        
        // * * * *  
        // *      * 
        //        * 
        // * * * * 
        /*for(int i = 1;i<=7;i++)
        {
            for(int j =1;j<=10;j++)
            {
                if(i==2&&j>2||j==2&&i<=5&&i>=2||i==4&&j==4||i==4&&j==6||i==4&&j==8||i==5&&j==9||i==6&&j==9||
                i==7&&j==8||i==7&&j==6||i==7&&j==4||i==7&&j==2)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

        // *********
        // *         
        // *         
        // ********* 
        // *        *
        // *        *
        //  ******** 

        /*
        for(int i = 1;i<=7;i++)
        {
            for(int j =1;j<=10;j++)
            {
                if(i==1&&j==1||i==7&&j==10||i==4&&j==10||i==7&&j==1)
                {
                    System.out.print(" ");
                }
                else if(j==1||i==1||i==4||j==10&&i>4||i==7)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

// **********
//         * 
//        *  
//       *   
//      *    
//     *     
//    * 
        /*for(int i = 1;i<=7;i++)
        {
            for(int j = 1;j<=10;j++)
            {
                if(i==1||j==11-i)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/
        //  ******** 
        // *        *
        // *        *
        // **********
        // *        *
        // *        *
        //  ******** 
        
        /*for(int i = 1;i<=7;i++)
        {
            for(int j = 1;j<=10;j++)
            {
                if(i==1&&j==1||i==1&&j==10||i==7&&j==1||i==7&&j==10)
                {
                    System.out.print(" ");
                }
                else if(i==1||j==1||j==10||i==4||i==7)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/

// ********* 
// *       * 
// *       * 
// ********* 
//         * 
//         * 
// ********* 
/*
        for(int i = 1;i<=7;i++)
        {
            for(int j = 1;j<=10;j++)
            {
                if(j==9||i==1&&j<9||j==1&&i<5||i==4&&j<9||i==7&&j<10)
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
        */ 
        int a=1;
  for(int i=1;i<=4;i++)
    {
        for(int j =1;j<=i;j++)
        {
            if(j!=1)
            {
                System.out.print("*"+a);
            }
            else{
                System.out.print(a);
            }
            a++;
        }
        System.out.println();
    }

    }
}