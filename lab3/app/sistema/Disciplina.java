package sistema;

public class Disciplina {

	String name;
	int credits;
	
	public Disciplina(String name, int credits) {
		setName(name);
		setCredits(credits);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}

}
