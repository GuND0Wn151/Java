import java.util.*;
class Bank{
	int balance=0;
	String name,ac_no;
	Bank(String a,String n){
		name=a;
		ac_no=n;
	}
	void showBalance(){
		System.out.println("Balance: "+balance);
						
	}
	void doWithdraw(int x){
		if(balance-x<0)
			System.out.println("NOt Enough Balance");
		else
			balance=balance-x;
	}
	void doDeposit(int x){
		balance=balance+x; 
		System.out.println("balance: "+balance);
	}
	
}
class Task18{
	public static void main(String argsp[]){
		int opt,a;
		Bank acc = new Bank("ram","12sd1");
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.println("1.Balance");
			System.out.println("2.Withdraw");
			System.out.println("3.Deposit");
			System.out.println("4.Exit");
			opt=input.nextInt();
			switch(opt){
				case 1:	acc.showBalance();
						break;
				case 2: System.out.println("enter the amount");
						a=input.nextInt();
						acc.doWithdraw(a);
						break;
				case 3: System.out.println("enter the amount");
						a=input.nextInt();
						acc.doDeposit(a);
						break;
				case 4:	System.exit(0);
						break;
						
			}
		}
	}
}