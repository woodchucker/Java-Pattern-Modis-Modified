package _11EnumImpl.enums;


import _11EnumImpl._11EnumImplMain;
import _11EnumImpl.message.Message;
import _11EnumImpl.models.Persona;

public enum Action {

	ADD_P(1, "Aggiungi persona") {
		@Override
		public Message doAction() {

			System.out.println("Inserisci il nome: ");
			String nome = _11EnumImplMain.s.nextLine();
			System.out.println("Inserisci l'email: ");
			
			String mail = _11EnumImplMain.s.nextLine();

			Persona p = new Persona(nome, mail);
			Message m = new Message();
			m.setPersona(p);
			return m;
		}
	},
	REM_P(2, "Rimuovi persona") {
		@Override
		public Message doAction() {
			// TODO Auto-generated method stub
			return null;
		}
	},
	SHOW_PS(3, "Mostra elenco") {
		@Override
		public Message doAction() {
			// TODO Auto-generated method stub
			return null;
		}
	};

	private int option;
	private String label;

	public abstract Message doAction();

	private Action(int option, String label) {
		this.option = option;
		this.label = label;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
