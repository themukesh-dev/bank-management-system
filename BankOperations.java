import java.util.ArrayList;
import java.util.Scanner;
class BankOpp extends NewAccount
{
    double bal = 0;
    Scanner sc = new Scanner(System.in);

    public void DepoMoney(ArrayList<NewAccount> acc)
    {
        System.out.println("------------Deposit Money------------");
        System.out.print("Enter Amount:- ");
        bal = sc.nextLong();
        System.out.println("Current Balance = " + bal);
    }
}

