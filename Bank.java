import java.util.Scanner;
class Account {
    String customer_name;
    long acc_no;
    float bal;

    public void inputDetails() {
    	  Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the Customer Name: ");
        customer_name = s.nextLine();
        System.out.print("\nEnter the Account Number: ");
        acc_no = s.nextLong();
        System.out.print("\nEnter the Starting Amount (Minimum Amount = 5000): ");
        bal = s.nextFloat();
        if(bal<5000f) {
            System.out.println("\nAccount Balance cannot be less than 5000.0 \n");
            System.exit(0);
        }
    }

    public void display() {
        System.out.println("\nCustomer Name: "+customer_name);
        System.out.println("Account Number: "+acc_no);
        System.out.println("Amount: "+bal);
    }
}

class SavingsAcc extends Account {
	float deposit, withdraw, interest;
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be deposited");
		deposit = sc.nextFloat();
		bal += deposit;
		System.out.println("Balance " + bal);
	}

	public void withdraw() {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn");
		withdraw = sc.nextFloat();
		if (bal<5000) {
			System.out.println("Insufficient funds \n Balance: " + bal);
		} else {
			bal -= withdraw;
			System.out.println("Balance " + bal);
		}
	}

	public void check_Bal() {
        if(bal<5000)
        {
            System.out.println("\nInsufficient Balance!!\nBalance: "+bal);
        }
        else
        {
            System.out.println("\nBalance: "+bal);
        }
   	 }

	public void interest() {
		interest = (bal*6)/100;
		bal += interest;
		System.out.println("Interest added: " + interest + "\n Balance: " + bal);
	}
}

class CurrentAcc extends Account {
	float deposit, withdraw, penalty;

	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to be deposited");
		deposit = sc.nextFloat();
		bal += deposit;
		System.out.println("Balance " + bal);
	}

	public void checkBalance() {
		if(bal < 5000) {
			penalty = (0.1f * bal);
			System.out.println("\nInitial Account Balance: "+bal);
			bal = bal-penalty;
			System.out.println("\nLow balance!\nPenalty Amount: " + penalty + "\nAccount balance: " + bal);
		} else {
			System.out.println("\n Balance: " + bal);
		}
	}

	public void withdraw() {
		System.out.print("\nEnter Amount to withdraw: ");
		Scanner sc = new Scanner(System.in);
            withdraw = sc.nextFloat();

            if(bal > 5000) {
            	bal-=withdraw;
            	System.out.println("\nAmount Withdrawn: "+withdraw+"\nBalance: "+bal);
            } else {
			System.out.println("Insufficient man");
		}
	}

	public void check_Bal() {
        	if(bal<5000)
        	{
           	 System.out.println("\nInsufficient Balance!!\nBalance: "+bal);
        	}
        	else
        	{
            	System.out.println("\nBalance: "+bal);
       	 }
   	 }

	public void chequebook() {
        System.out.println("\nCheque Book has been Issued!");
    }

}

class Bank {
	public static void main(String arghs[]) {
		Scanner sc = new Scanner(System.in);
		String ch;
		int n;
		CurrentAcc ca = new CurrentAcc();
		SavingsAcc sa = new SavingsAcc();

		System.out.println("Enter (S) for savings and (C) for current account");
		ch = sc.next();
		
		switch(ch.toLowerCase()) {
			case "s": sa.inputDetails();
				    while(true) {
					System.out.println("1. Deposit 2. Withdraw 3. Check balance 4. Withdraw 5. Display details 6. Exit transaction");
					n = sc.nextInt();
					switch(n) {
						case 1: sa.deposit();
							  break;
						case 2: sa.withdraw();
							  break;
						case 3: sa.check_Bal();
							  break;
						case 4: sa.interest();
							  break;
						case 5: sa.display();
							  break;
						case 6: System.out.println("Exiting");
							  break;
						default: System.out.println("Invalid");
							   break;
					}
				    }

			case "c": ca.inputDetails();
				    while(true) {
					System.out.println("1. Deposit 2. Withdraw 3. Check balance 4. Chequebook 5. Display details 6. Exit transaction");
					n = sc.nextInt();
					switch(n) {
						case 1: ca.deposit();
							  break;
						case 2: ca.withdraw();
							  break;
						case 3: ca.check_Bal();
							  break;
						case 4: ca.chequebook();
							  break;
						case 5: ca.display();
							  break;
						case 6: System.out.println("Exiting");
							  break;
						default: System.out.println("Invalid");
							   break;
					}
				    }

			default: break;
		}
	}
}






























