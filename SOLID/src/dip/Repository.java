package dip;

public interface Repository<T> {

	public void add(T t);
	public void delete(T t);
	public T update(T t);
}
