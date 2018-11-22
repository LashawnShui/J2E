package entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
	private String username;
	private Integer age;
	private List<String> hobbyList;
	private Set<String> hobbySet;
	private Map<String, String> hobbyMap;
	private Properties hobbyProperties;
	private String email;
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setHobbyList(List<String> hobbyList) {
		this.hobbyList = hobbyList;
	}
	public void setHobbySet(Set<String> hobbySet) {
		this.hobbySet = hobbySet;
	}
	public void setHobbyMap(Map<String, String> hobbyMap) {
		this.hobbyMap = hobbyMap;
	}
	public void setHobbyProperties(Properties hobbyProperties) {
		this.hobbyProperties = hobbyProperties;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User£º"
				+ "\n\tusername = " + username
				+ "\n\tage = " + age
				+ "\n\thobbyList = " + hobbyList
				+ "\n\thobbySet = " + hobbySet
				+ "\n\thobbyMap = " + hobbyMap
				+ "\n\thobbyProperties = " + hobbyProperties
				+ "\n\temail = " + email;
	}
}
