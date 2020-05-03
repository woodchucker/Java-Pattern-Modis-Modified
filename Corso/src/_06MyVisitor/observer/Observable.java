package _06MyVisitor.observer;

import java.util.ArrayList;

public class Observable {

	ArrayList<IObserver> observers = new ArrayList<IObserver>();
	
	public void subscribe(IObserver o){
		observers.add(o);
	}
	
	public void unsubscribe(IObserver o) {
		observers.remove(o);
	}
	
	public void emit(Observable obs) {
		for (IObserver o: observers) {
			o.update(obs);
		}
	}
}
