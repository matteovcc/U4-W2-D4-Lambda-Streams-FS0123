package lezionept2;

public class Student {
	private String nome;
	private String cognome;
	private int age;

	public Student(String nome, String cognome, int age) {
		super();
		this.setNome(nome);
		this.setCognome(cognome);
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
