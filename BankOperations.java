import java.util.ArrayList;
import java.util.Scanner;
class BankOpp extends NewAccount
{
    double depo ;
    double amt;
    double with;
    Scanner sc = new Scanner(System.in);

    public void DepoMoney(ArrayList<NewAccount> acc)
    {
        System.out.println("------------Deposit Money------------");
        findAcc(acc);
        System.out.print("Enter Amount:- ");
        amt = sc.nextDouble();
        System.out.println(amt+ " "+"Deposited");
        balance = balance + amt;
    }

    public void Withdraw(ArrayList<NewAccount> acc)
    {
        System.out.println("------------Withdraw Money------------");
        CheckUpi(acc);
        System.out.print("Enter Amount:- ");
        with = sc.nextDouble();
        if(with>balance)
        {
            System.out.println("Insufficient balance. Withdrawal cannot be processed.");
        }
        System.out.println(with + " " + "withdrawed");
        balance = balance - with ;
       
    }

    public void CheckBal(ArrayList<NewAccount> acc)
    {
        System.out.println("------------Check Balance------------");
        CheckUpi(acc);
        for(NewAccount a:acc)
        {
        System.out.println("Available Balance:- " + a.balance);
        }
            
    
    }

    public void TransferMoney(ArrayList<NewAccount> acc)
    {
        System.out.println("------------Transfer Money------------");
        findAcc(acc);
        System.out.print("Enter the recipient's account number:-" );
        long RecipAcc = sc.nextLong();
        boolean found = false;
         for( NewAccount b : acc)
        {
            if(RecipAcc==b.accnum)
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
        
            System.out.print("Enter amount:- ");
            amt = sc.nextDouble();
        
            for( NewAccount b : acc)
            {
                if(RecipAcc==b.accnum)
                {
                System.out.println(amt+" "+"credited to "+b.name);
                b.balance=b.balance+amt;
                
                }
            }
            for( NewAccount a : acc)
            {
                if(EnteredAcc==a.accnum)
                {
                System.out.println(amt + " "+ "debited from "+a.name);
                a.balance=a.balance-amt;
                
                }
            }
    }
}


