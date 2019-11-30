package homeWork1;

public class Cat {
	
	private int age;
	
	public Cat(int age) {
		setAge(age);
		for (int i = 1; i <= age; i++) {
			speak();	
		}
		
	}
	
	private Cat() {
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void speak() {
		System.out.println("meow");
	}

}
