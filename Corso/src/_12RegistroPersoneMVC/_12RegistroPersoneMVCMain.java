package _12RegistroPersoneMVC;

import java.util.Scanner;

import _12RegistroPersoneMVC.controller.ActionController;
import _12RegistroPersoneMVC.model.Registro;
import _12RegistroPersoneMVC.view.View;

public class _12RegistroPersoneMVCMain {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Registro model = new Registro();
		View view = new View();
		ActionController controller = new ActionController(model);
		
		view.subscribe(controller);
		model.subscribe(view);
		
		while(true) {
			view.richiediInput();
			view.mostraOutput();
		}
	}

}
