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
    Scanner sc = new Scanner(System.in);

    public void CreateAcc()
    {
        Random r = new Random();
        accnum = r.nextLong(10000000,99999999);
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

    public void UpdateDetails(ArrayList<NewAccount> acc)
    {
        long EnteredAcc;
        int choice;
        System.out.println("------------Update Account Details------------");
        System.out.print("Enter account number:- ");
        EnteredAcc = sc.nextLong();
        boolean found = false;
        
        for( NewAccount a : acc)
        {
            if(EnteredAcc==a.accnum)
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

            System.out.println("Select the appropriate choice");
            System.out.println("1. Name");
            System.out.println("2. Age");
            System.out.println("3. Mobile Number");
            System.out.println("4. Email id");
            System.out.print("Enter your choice:- ");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter your updated name:-");
                    this.name=sc.next();
                    break;
                    
                case 2:
                    System.out.print("Enter your updated age:-");
                    this.age=sc.nextInt();
                    break;

                case 3:
                    System.out.print("Enter your updated email:-");
                    this.email=sc.next();
                    break;

                case 4:
                    System.out.print("Enter your updated mobile number:-");
                    this.mob=sc.next();
                    break;
                
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
    }

    public void DeleteAcc(ArrayList<NewAccount> acc)
    {
        long EnteredAcc;
        System.out.println("-----------Delete Account-----------");
        System.out.print("Enter account number:- ");
        EnteredAcc = sc.nextLong();
        boolean found = false;
        
        for( NewAccount a : acc)
        {
            if(EnteredAcc==a.accnum)
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
        
        for(int i=0; i<acc.size();i++)
        {
            if(EnteredAcc==acc.get(i).accnum)
            {
                acc.remove(i);
                break;
            }
        }

        System.out.println("-----------------Account Deleted Successfully-----------------");
    }

}


class A
{
    public static void main(String args[])
    {
        NewAccount obj1 = new NewAccount();
        
        obj1.CreateAcc();
        System.out.println();
        
        ArrayList<NewAccount> acc = new ArrayList<NewAccount>();
        acc.add(obj1);
        
        obj1.UpdateDetails(acc);
        System.out.println();

        for(NewAccount a : acc)
        {
            a.ShowDetails();
        }

        System.out.println();
        obj1.DeleteAcc(acc);


        

        

    }
}