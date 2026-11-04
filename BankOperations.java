import java.util.ArrayList;
import java.util.Scanner;
class BankOpp extends NewAccount
{
    double bal ;
    double a;
    double with;
    Scanner sc = new Scanner(System.in);

    public void DepoMoney(ArrayList<NewAccount> acc)
    {
        System.out.println("------------Deposit Money------------");
        findAcc(acc);
        System.out.print("Enter Amount:- ");
        a = sc.nextDouble();
        System.out.println(a+ " "+"Deposited");
        bal = bal + a;
    }
    public void Withdraw(ArrayList<NewAccount> acc)
    {
        System.out.println("------------Withdraw Money------------");
        CheckUpi(acc);
        System.out.print("Enter Amount:- ");
        with = sc.nextDouble();
        if(with>bal)
        {
            System.out.println("Insufficient balance. Withdrawal cannot be processed.");
        }
        System.out.println(with + " " + "withdrawed");
        bal = bal - with ;
       
    }
    public void CheckBal(ArrayList<NewAccount> acc)
    {
        System.out.println("------------Check Balance------------");
        CheckUpi(acc);
        System.out.println("Available Balance:- " + bal);
    }
    public void TransferMoney(ArrayList<NewAccount> acc)
    {
        findAcc(acc);
        System.out.print("Enter the recipient's account number:-" );
        long RecipAcc = sc.nextLong();
        boolean found = false;
         for( NewAccount a : acc)
        {
            if(RecipAcc==a.accnum)
            {
            System.out.println("Account Found");
            found = true;
            break;
            }
        }
            
            if(found == false)
            {
                System.out.println("Account missing");
            }
        
            System.out.println("Enter amount:- ");
            a = sc.nextDouble();
            
        
        

        
    }
}

