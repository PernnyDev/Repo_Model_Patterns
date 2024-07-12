package ilp037.structural.chainofresponsability;

public class Dispenser20Chain extends Chain<Currency> {

	@Override
	public void execute(Currency currency) {
		if (currency.getAmount() >= 20) {
			int num = currency.getAmount() / 20;
			int reminder = currency.getAmount() % 20;
			System.out.println("Dispensing " + num + " $20");
			if (reminder > 0) this.nextChain.execute(new Currency(reminder));
		} else {
			this.nextChain.execute(currency);
		}
	}
}