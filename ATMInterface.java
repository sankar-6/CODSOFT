import java.util.Scanner;
class ATMMachine {
    float account_balance;
    public void user_interface(){
        System.out.println("Welcome to The ATM");
        System.out.println("1.Withdraw Amount");
        System.out.println("2.Deposit Amount");
        System.out.println("3.Check Balance");
        System.out.println("4.Log Out");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        if(choice == 1){
            withdraw_amount();
        }
        else if(choice == 2){
            deposit_amount();
        }
        else if(choice == 3){
            check_balance();
        }
        else if(choice == 4){
            System.out.println("Log Out Succesfully..");
            System.out.println("Thank you..");
            return;
        }
        else{
            System.out.println("Please Enter a valid choice..");
        }
    }
        
    public void withdraw_amount(){
        System.out.println("Enter the Amount:");
        Scanner in = new Scanner(System.in);
        float withdraw_amount = in.nextFloat();
        if(account_balance>withdraw_amount){
            account_balance -= withdraw_amount;
            System.out.println("Money Withdrawl Succesfully!");
        }
        else{
            System.out.println("Insufficient balance");
        }
        user_interface();
    }
    public void deposit_amount(){
        System.out.println("Enter The Amount:");
        Scanner in = new Scanner(System.in);
        float deposit_amount = in.nextFloat();
        account_balance += deposit_amount;
        System.out.println("Money Deposited Successfully!");
        user_interface();
    }
    public void check_balance(){
        System.out.println("Account Balance Fetched Successfully.");
        System.out.println("Balance:"+account_balance);
        user_interface();
    }
}

    class ATMInterface{
        public static void main(String[] args) {
           ATMMachine obj = new ATMMachine();
           int  security_pin = 2006;
           System.out.println("--->- Enter The Security PIN -<---"); 
           Scanner in = new Scanner(System.in);
           int user_pin = in.nextInt();
           if(user_pin == 2006){
                System.out.println("Login Successful..");
                obj.user_interface();
           }
           else{
                System.out.println("Sorry! You Entered a Wrong PIN");
                System.out.println("Please Enter a valid pin");
           }
        }
    }

