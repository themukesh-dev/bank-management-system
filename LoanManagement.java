import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class LoanManage extends BankOpp
{
    double amt;
    String loan;
    long ref;
    Scanner sc = new Scanner(System.in);
    public void ApplyLoan(ArrayList<NewAccount> acc)
    {
        System.out.println("----------Loan Application----------");
        System.out.println("Please verify your account");
        findAcc(acc);
        System.out.print("Enter your name:- ");
        this.name = sc.next();
        System.out.println("----------Select Loan Type----------");
        System.out.println("1.Personal Loan");
        System.out.println("2.Car Loan");
        System.out.println("3.Housing Loan");
        System.out.print("Your required loan type:- ");
        loan = sc.next();
        System.out.println("----------------------------------------------------");
        System.out.println("You are applying for a "+loan+" loan");
        System.out.println("----------------------------------------------------");
        System.out.print("Enter loan amount:- ");
        amt = sc.nextInt();
        System.out.println(amt + " " + "will be credited soon.............");
        Random r = new Random();
        ref = r.nextLong(10000000,99999999);
        System.out.println("Loan reference no.:- "+ref );
    }
    public void ShowLoan()
    {
        System.out.println("-------------Loan Details-------------");
        System.out.println(EnteredAcc+" "+name+" "+loan+" "+ref+" "+amt);
    }
}