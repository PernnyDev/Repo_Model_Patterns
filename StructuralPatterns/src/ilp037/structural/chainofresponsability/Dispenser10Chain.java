package ilp037.structural.chainofresponsability;

public class Dispenser10Chain extends Chain<Currency> {

	@Override
	public void execute(Currency currency) {
		if (currency.getAmount() >= 10) {
			int num = currency.getAmount() / 10;
			int reminder = currency.getAmount() % 10;
			System.out.println("Dispensing " + num + " $10");
			if (reminder > 0) this.nextChain.execute(new Currency(reminder));
		} else {
			this.nextChain.execute(currency);
		}
	}
}