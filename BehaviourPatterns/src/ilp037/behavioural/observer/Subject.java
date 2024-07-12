package ilp037.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject<T> {
	private final List<Observer<T>> observers = new ArrayList<Observer<T>>();
	
	public void attach(Observer<T> obs) {
		this.observers.add(obs);
	}
	public void detach(Observer<T> obs) {
		this.observers.remove(obs);
	}
	public void notifyObservers(T arg) {
		observers.parallelStream().forEach(o -> o.update(arg));		
	}
}
