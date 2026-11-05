import java.util.ArrayList;

class Main
{
    public static void main(String args[])
    {
        NewAccount obj1 = new NewAccount();
        NewAccount obj2 = new NewAccount();
        BankOpp d1 = new BankOpp();
        BankOpp d2 = new BankOpp();
        
        obj1.CreateAcc();
        System.out.println();
        obj2.CreateAcc();
        System.out.println();
        
        ArrayList<NewAccount> acc = new ArrayList<NewAccount>();
        acc.add(obj1);
        acc.add(obj2);
        
        
        for(NewAccount a : acc)
        {
            a.ShowDetails();
        }

        System.out.println();
        
        
        System.out.println();
        d1.DepoMoney(acc);

    

        System.out.println();
        d1.TransferMoney(acc);

        System.out.println();
        d2.CheckBal(acc);
    }
}