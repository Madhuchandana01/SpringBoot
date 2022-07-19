


 class BankCustomer{
	 
	String custName;
	int custAccNo;
	float custBalance;
	 void setCustomer(String name,int AccNo, float balance) {
		custName=name;
		custAccNo=AccNo;
		custBalance=balance;
	}
	void getCustomer() {
		System.out.println("Customer Name is "+custName);
		System.out.println("Customer AccNo is "+custAccNo);
		System.out.println("Customer balance is "+custBalance);
	}
	
}	
  public class DemoMethod5{
		public static void main(String args[]) {
			
			BankCustomer ob = new BankCustomer();
			ob.setCustomer("Madhu",0036,50000);
			ob.getCustomer();
		}
	}

