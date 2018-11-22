package cn.springdemo;

public class Greeting {
	private String person = "Nobody";
	private String words = "nothing";

	public Greeting() {
		super();
	}
	public Greeting(String person, String words) {
		super();
		this.person = person;
		this.words = words;
	}

	public void sayGreeting() {
		System.out.println(person + " Ëµ£º¡°" + words + "¡± ");
	}
}