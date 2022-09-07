package ProgramsJava;
import java.util.Scanner;

class Mybank{
    private int balance = 50000;

    public void setDeposit(int a)
    {
        if(a<50000&&a>0)
        {
            this.balance = balance+a;
            System.out.print("New Balance:- "+this.balance);
        }
        else{
            System .out.print("Maintain the balance");
        }
    }
    public int getBalance()
    {
        return balance;
    }
    public void getWithdraw(int a)
    {
        if(a<balance&&a>0)
        {
            this.balance = balance-a;
            System.out.print("New Balance:- "+this.balance);
        }
        else if(a<0)
        {
            System.out.print("KUCH BHI CHAIYEH TUJHE HAINN, ULTA PAIDA HUA THA KYA");
        }
        else{
            System.out.print("DEK PAISE NHI TUMHARE PAS , PHELE KAMAO");
        }

    }
}
class Bank{
    public static void main(String[] args)
    {
        int n=1,i =0;
        Scanner sc  = new Scanner(System.in);
        Mybank b = new Mybank();
        while(i<n){
                System.out.println("1)DEPOSIT ");
                System.out.println("2)WITHDRAW ");
                System.out.println("3)CHECK BALANCE ");
                System.out.print("Get:- ");
                int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the amount for deposit");
                    int send = sc.nextInt();
                    b.setDeposit(send);
                    i++;
                    break;
                case 2:
                    System.out.print("Enter Amount to withdraw");
                    int get = sc.nextInt();
                    b.getWithdraw(get);
                    i++;
                    break;
                case 3:
                    System.out.print("Bank balance");
                    System.out.print(b.getBalance());
                    i++;
                    break;
                default:
                    System.out.print("Wrong Input");
                    i++;
                    break;
            }
            n++;
        }
        sc.close();
    }
}