package cn.springdemo;

public class Greeting {
	private String person = "Nobody";
	private String words = "nothing";
	
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}

	public void sayGreeting() {
		System.out.println(person + " Ëµ£º¡°" + words + "¡± ");
	}
}