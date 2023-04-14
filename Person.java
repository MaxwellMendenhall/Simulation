public class Person {
	
	private int birthday;
	
	public Person() {
		birthday = Birthday.getBirthday();
	}
	public int getBirthday() {
		return birthday;
	}
}
