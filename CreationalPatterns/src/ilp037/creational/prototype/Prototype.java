package ilp037.creational.prototype;

public class Prototype<T extends Cloneable> {

	@SuppressWarnings("unchecked")
	public T copy() {
		try {
			return (T)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
