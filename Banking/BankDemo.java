public class BankDemo
{
public static void main(String [] aargs)
 {
   CheckingAccount c=new CheckingAccount(101);
   System.out.println("Depositing $500 ...");
   c.deposit(500.00);
   try{
   System.out.println("\n withdrawing $ 100 ...");
   c.withdraw(200.00);
   System.out.println("\n Withdrawing $600 ....");
   c.withdraw(600.00);
   }
   catch(InsufficientFundsException e){
   System.out.println("Sorry, but you are short $ "+e.getAmount());
   e.printStackTrace();
                         }
	
	}
	
	}
