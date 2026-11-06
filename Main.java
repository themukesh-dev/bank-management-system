import java.util.ArrayList;

class Main
{
    public static void main(String args[])
    {
        NewAccount obj1 = new NewAccount();
        NewAccount obj2 = new NewAccount();
        BankOpp d1 = new BankOpp();
        BankOpp d2 = new BankOpp();
        LoanManage l1 = new LoanManage();
        
        obj1.CreateAcc();
        System.out.println();
        // obj2.CreateAcc();
        // System.out.println();
        
        ArrayList<NewAccount> acc = new ArrayList<NewAccount>();
        acc.add(obj1);
    
        // acc.add(obj2);

        ArrayList<LoanManage> LM = new ArrayList<LoanManage>();
        LM.add(l1);
        
        
        for(NewAccount a : acc)
        {
            a.ShowDetails();
        }
        

        System.out.println();
        
        
        // System.out.println();
        // d1.DepoMoney(acc);

        System.out.println();
        l1.ApplyLoan(acc);

        System.out.println();

        for(LoanManage a : LM)
        {
            a.ShowLoan();
        }

        


    

        // System.out.println();
        // d1.TransferMoney(acc);

        // System.out.println();
        // d2.CheckBal(acc);
    }
}