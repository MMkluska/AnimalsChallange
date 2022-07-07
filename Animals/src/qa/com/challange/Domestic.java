package qa.com.challange;

public class Domestic extends Animals {

	private String name;
	private boolean canYouPet;

	// Constructors
	public Domestic() {

	}

	public Domestic(String eats, boolean vegetarian, String orgin, int numberOfLegs, String name, boolean canYouPet) {
		super(eats, vegetarian, orgin, numberOfLegs);
		this.name = name;
		this.canYouPet = canYouPet;
	}

	// Getters and Setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCanYouPet() {
		return this.canYouPet;
	}

	public void setCanYouPet(boolean canYouPet) {
		this.canYouPet = canYouPet;
	}

	// Specific toString()
	public String toStringDom() {
		return "Domestic [Name: " + name + ", Can you pet: " + canYouPet + ", Eats: " + getEats()
				+ ", Is it vegetarian: " + isVegetarian() + ", Orgin: " + getOrgin() + ", Number of legs: "
				+ getNumberOfLegs() + "]";
	}

	// Methods
	@Override
	public void canYouPet() {
		if (isCanYouPet()) {
			System.out.println("Come on! Go ahead!");
		} else {
			System.out.println("Sorry, no.");
		}
	}

	public void call() {
		System.out.println("Hey " + getName() + " ! Where are you?");
	}

	@Override
	public void doTrick() {
		System.out.println("Hey " + getName() + " ! Do that trick!");
	}

	public void renamePet(String name) {
		System.out.print("Hey " + getName());
		setName(name);
		System.out.println(" from now on you are " + getName());
	}
}
