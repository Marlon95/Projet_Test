package sqli.df.tp.tp_test;

public class Bar {
	
	private int capacite;
	private int personnes;
	private String full;

	public Bar(int capacite) {
		this.capacite = capacite;
	}

	public void setPeople(int arg1) {
		this.personnes = arg1;
		this.full = isFull();
	}

	public void add(int arg1) {
		if (this.personnes + arg1 > this.capacite) {
			this.full = isFull();
		} else {
			this.personnes+= arg1;
			this.full = isFull();
		}
	}

	public String isFull() {
		if (this.personnes < this.capacite) {
			return "false";
		} else {
			return "true";
		}
	}

}
