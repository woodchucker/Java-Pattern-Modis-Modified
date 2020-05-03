package _11EnumImpl.controllers;

import _11EnumImpl.enums.Action;
import _11EnumImpl.utilities.Observable;
import _11EnumImpl.utilities.Observer;
import _11EnumImpl.views.View;

public abstract class Controller implements Observer{
	private Action a;
	private View v;
	
	@Override
	public void update(Observable o) {
		setV( (View)o );
		
	}

	public abstract void doAction();

	public Action getA() {
		return a;
	}

	public void setA(Action a) {
		this.a = a;
	}

	public View getV() {
		return v;
	}

	public void setV(View v) {
		this.v = v;
	}

}
