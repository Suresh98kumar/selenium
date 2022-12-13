package encapsulation;
import java.util.Scanner;
public class emicalculator {
	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
		emicalcis e = new emicalcis();
		System.out.println("Enter the amount required");
		float amt = scan.nextFloat();
		System.out.println("In how many months will you return?");
		int t = scan.nextInt();
		System.out.println("Your monthly EMI is Rs."+(int)e.findEMI(amt,t)+"/-");
	}
}

