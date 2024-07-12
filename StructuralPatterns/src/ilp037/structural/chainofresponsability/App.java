package ilp037.structural.chainofresponsability;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Chain<Currency> c1 = new Dispenser50Chain();
		Chain<Currency> c2 = new Dispenser20Chain();
		Chain<Currency> c3 = new Dispenser10Chain();
		
		c1.setNextChain(c2);
		c2.setNextChain(c3);
		
		Scanner sc = new Scanner(System.in);
		
		int amount = 0;
		do {
			System.out.println("Enter amount to dispense or 0 to exit");
			amount = sc.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be multiple of 10");
			} else if (amount > 0) {
				c1.execute(new Currency(amount));
			}
		} while (amount > 0);
		
		sc.close();
	}

}
