package homeWork10;

public class Dog extends Animal {
	private String name;
	
	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}
	public Dog() {
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
		System.out.println("ouw ouw");
		}
	
	@Override
	public void eat() {
		System.out.println("Dog " + getName() + " eat " + getRation());
		}
	
	@Override
	public void sleep() {
		System.out.println("Dog " + getName() + " sleep");
		}
	
	@Override
	public String toString() {
		return "Dog [" + super.toString() + " name=" + name + "]";
	}

}
