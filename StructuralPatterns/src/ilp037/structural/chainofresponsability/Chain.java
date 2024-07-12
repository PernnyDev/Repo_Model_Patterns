package ilp037.structural.chainofresponsability;

public abstract class Chain<T> {
	protected Chain<T> nextChain;

	public void setNextChain(Chain<T> nextChain) {
		this.nextChain = nextChain;
	}
	
	public abstract void execute(T t);
}
