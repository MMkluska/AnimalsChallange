package qa.com.challange;

public class NonDangerous extends Wild {

	private String giveName;
	private boolean tameable;

	// Constructors
	public NonDangerous() {

	}

	public NonDangerous(String eats, boolean vegetarian, String orgin, int numberOfLegs, String terrainType,
			boolean canYouPet, String giveName, boolean tameable) {
		super(eats, vegetarian, orgin, numberOfLegs, terrainType, canYouPet);
		this.giveName = giveName;
		this.tameable = tameable;
	}

	// Getters and Setters
	public String getGiveName() {
		return this.giveName;
	}

	public void setGiveName(String giveName) {
		this.giveName = giveName;
	}

	public boolean isTameable() {
		return this.tameable;
	}

	public void setTameable(boolean tameable) {
		this.tameable = tameable;
	}

	// Specific toString()
	public String toStringNonDan() {
		return "NonDangerous [Name: " + giveName + ", Tameable: " + tameable + ", Terrain type: " + getTerrainType()
				+ ", Can you pet: " + isCanYouPet() + ", Eats: " + getEats() + ", Vegetarian: " + isVegetarian()
				+ ", Orgin: " + getOrgin() + ", Number of legs: " + getNumberOfLegs() + "]";
	}

	// Methods
	@Override
	public void canYouPet() {
		if (isCanYouPet()) {
			System.out.println("Hey! " + getGiveName() + "I am your friend!");
		} else {
			System.out.println("No. It is running away!");
		}
	}

	@Override
	public void doTrick() {
		if (isCanYouPet() && isTameable()) {
			System.out.println("It doesn't know any tricks, but you can teach it!");
		} else {
			System.out.println("This animal doesn't know any tricks!");
		}

	}

	public void call() {
		System.out.println("Hey " + getGiveName() + " ! Where are you?");
	}

	public void tame() {
		if (isTameable()) {
			System.out.println("Hey " + getGiveName() + " ! Let's be friends");
		} else {
			System.out.println("It runs away!");
		}
	}
}
