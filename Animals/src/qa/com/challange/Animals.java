package qa.com.challange;

public class Animals implements CanYouPet, DoTrick {

	private String eats;
	private boolean vegetarian;
	private String orgin;
	private int numberOfLegs;

	// Constructors
	public Animals() {

	}

	public Animals(String eats, boolean vegetarian, String orgin, int numberOfLegs) {
		this.eats = eats;
		this.vegetarian = vegetarian;
		this.orgin = orgin;
		this.numberOfLegs = numberOfLegs;
	}

	// Getters and Setters
	public String getEats() {
		return this.eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public boolean isVegetarian() {
		return this.vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getOrgin() {
		return this.orgin;
	}

	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}

	public int getNumberOfLegs() {
		return this.numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	// Specific toString()
	public String toStringAnimals() {
		return "Animals [Eats: " + eats + ", Vegetarian: " + vegetarian + ", Orgin: " + orgin + ", Number of legs: "
				+ numberOfLegs + "]";
	}

	// Methods
	public void makeSound(String sound) {
		System.out.println("It sounds something like this: " + sound);
	}

	public void howItMoves() {
		if (getNumberOfLegs() == 0) {
			System.out.println("It is crawling or swimming.");
		} else if (getNumberOfLegs() == 2) {
			System.out.println("It is walking like human.");
		} else if (getNumberOfLegs() % 2 == 0) {
			System.out.println("It is running on all of its legs.");
		} else {
			System.out.println("Just RUN!!!!");
		}
	}

	@Override
	public void canYouPet() {
		System.out.println("We are not sure at this stage!");

	}

	@Override
	public void doTrick() {
		System.out.println("This animal doesn't know any tricks!");
	}
}
