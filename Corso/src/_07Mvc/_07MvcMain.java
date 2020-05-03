package _07Mvc;

import _07Mvc.controllers.ActionController;
import _07Mvc.models.Registro;
import _07Mvc.view.View;

public class _07MvcMain {

	public static void main(String[] args) {
		
		Registro model = new Registro();
		View view = new View();
		ActionController controller = new ActionController();
		
		controller.setRegistro(model);
		
		view.subscribe(controller);
		model.subscribe(view);
		
		while (true) {
			view.richiediInput();
		}
	}

}
