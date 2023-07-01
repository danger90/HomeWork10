package homeWork10;

public class Cat extends Animal {
	private String name;
	
	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}
	public Cat() {
	super();
	}
	
	public String getName() {
		return name;
		}

	public void setName(String name) {
		this.name = name;
		}

	@Override
	public void getVoice() {
	System.out.println("meow meow");
	}
	
	@Override
	public void eat() {
		System.out.println("Cat " + getName() + " eat " + getRation());
			}
	
	@Override
	public void sleep() {
		System.out.println("Cat " + getName() + " sleep");
			}
	
	@Override
	public String toString() {
		return "Cat [" + super.toString() + " name=" + name + "]";
	}

}
