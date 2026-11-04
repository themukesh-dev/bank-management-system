import java.util.ArrayList;

class Main
{
    public static void main(String args[])
    {
        NewAccount obj1 = new NewAccount();
        BankOpp d1 = new BankOpp();
        
        obj1.CreateAcc();
        System.out.println();
        
        ArrayList<NewAccount> acc = new ArrayList<NewAccount>();
        acc.add(obj1);
        
        // obj1.UpdateDetails(acc);
        // System.out.println();

        for(NewAccount a : acc)
        {
            a.ShowDetails();
        }

        System.out.println();
        // obj1.DeleteAcc(acc);
        obj1.findAcc(acc);
        System.out.println();
        d1.DepoMoney(acc);
    }
}