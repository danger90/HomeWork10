package homeWork10;

public class Veterinarian {
	private String name;
	
	public Veterinarian(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void treatment(Animal animal) {
		System.out.println("Doctor " + getName() + " treatment " + animal);
	}

	@Override
	public String toString() {
		return "Veterinarian [name=" + name + "]";
	}
	
	
	
}
