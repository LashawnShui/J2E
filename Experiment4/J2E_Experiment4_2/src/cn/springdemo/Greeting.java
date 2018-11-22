package cn.springdemo;

public class Greeting {
	private String person = "Nobody";
	private String words = "nothing";

	public void setPerson(String person) {
		this.person = person;
	}
	public void setWords(String words) {
		this.words = words;
	}

	public Greeting() {
		super();
	}

	public void sayGreeting() {
		System.out.println(person + " Ëµ£º¡°" + words + "¡± ");
	}
}