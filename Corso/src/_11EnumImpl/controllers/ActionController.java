package _11EnumImpl.controllers;


import java.util.ArrayList;
import java.util.Arrays;

import _11EnumImpl.models.Registro;
import _11EnumImpl.utilities.Observable;
import _11EnumImpl.utilities.Observer;

public class ActionController implements Observer {

	private Registro r;
	
	public ActionController(Registro r) {
		super();
		this.r = r;
	}

	public void getController(int option) {
		ArrayList<Controller> controllers =new ArrayList<Controller>(); 
		controllers.addAll(Arrays.asList(new AddController(r)));
				//, new RemoveController(), new ShowController()));

	}

	@Override
	public void update(Observable o) {
		// TODO Auto-generated method stub

	}

}
