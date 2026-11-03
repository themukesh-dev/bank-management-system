import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
class NewAccount
{
    String name;
    String acc;
    int age;
    String mob;
    String email;
    long accnum;
    public void CreateAcc()
    {
        Random r = new Random();
        accnum = r.nextLong(10000000,99999999);
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Account Creation----------");
        System.out.println("Account Types");
        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");
        System.out.print("Select Account Type:- ");
        this.acc = sc.next();
        System.out.println("You are creating a " + acc + " account." );
        System.out.print("Enter your name:- ");
        this.name = sc.next();
        System.out.print("Enter your age:- ");
        this.age = sc.nextInt();
        System.out.print("Enter your mobile number:- ");
        this.mob = sc.next();
        System.out.print("Enter your email id:- ");
        this.email = sc.next();
        System.out.println("Your account number is:- "+ accnum);
        System.out.println("-----------------Account Created Successfully-----------------");
     
    }
    public void ShowDetails()
    {
        System.out.println("-------------Account Details-------------");
        System.out.println(acc+" "+ name+" "+age+" "+mob+" "+email+" "+accnum);
    }
}


class A
{
    public static void main(String args[])
    {
        NewAccount obj1 = new NewAccount();
        NewAccount obj2 = new NewAccount();
        obj1.CreateAcc();
        obj2.CreateAcc();
       
       

        ArrayList<NewAccount> acc = new ArrayList<NewAccount>();
        acc.add(obj1);
        acc.add(obj2);

        for(NewAccount a : acc)
        {
            a.ShowDetails();
        }
    }
}