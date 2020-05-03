package _06MyVisitor.models;

import _06MyVisitor.IVisitor.IVisitable;
import _06MyVisitor.IVisitor.IVisitor;
import _06MyVisitor.observer.IObserver;
import _06MyVisitor.observer.Observable;

public abstract class AbstractMessage implements IVisitable, IObserver{

	public abstract void accept(IVisitor iv);
	
	public void visit(IVisitor... ivs) {
		
		for(IVisitor iv: ivs) {
			this.accept(iv);
			
		}
	}
	
	public void update(Observable obs) {	
		
	}
}
