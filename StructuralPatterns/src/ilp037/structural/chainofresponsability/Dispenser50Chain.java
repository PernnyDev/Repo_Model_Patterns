package ilp037.structural.chainofresponsability;

public class Dispenser50Chain extends Chain<Currency> {

	@Override
	public void execute(Currency currency) {
		if (currency.getAmount() >= 50) {
			int num = currency.getAmount() / 50;
			int reminder = currency.getAmount() % 50;
			System.out.println("Dispensing " + num + " $50");
			if (reminder > 0) this.nextChain.execute(new Currency(reminder));
		} else {
			this.nextChain.execute(currency);
		}
	}
}
