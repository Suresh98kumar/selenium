package Threads;
public class Mytaskthread {
	public static void main(String[] args) {
		 
		
		
		String customers []= {"Raj ", "Vinoth " , "Surender"};
		
		for(int i=0;i<customers.length;i++) {
			
			System.out.println("Welcome " + customers[i]);
			System.out.println(" ");
			
			System.out.println("Select the fruit juice");
			System.out.println(" ");
			System.out.println("1.Apple Juice " + "2.Mango Juice " + "3.Orange Juice");
			System.out.println(" ");
		
		}
		
		Apple a = new Apple();
		
		Thread t= new Thread (a);
		
		t.setName("JuiceMaker");
		t.setDaemon(false);// If true is stoped with Main.. If false is given it will continue with actual class. 
		t.start();
		//try {
			//t.join(); // Block the others to en…
}
}
