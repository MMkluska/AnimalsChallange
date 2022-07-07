package qa.com.challange;

public class Dangerous extends Wild {

	private boolean venomous;
	private boolean poisonous;
	private boolean fangsAndClaws;

	// Constructors
	public Dangerous() {

	}

	public Dangerous(String eats, boolean vegetarian, String orgin, int numberOfLegs, String terrainType,
			boolean canYouPet, boolean venomous, boolean poisonous, boolean fangsAndClaws) {
		super(eats, vegetarian, orgin, numberOfLegs, terrainType, canYouPet);
		this.venomous = venomous;
		this.poisonous = poisonous;
		this.fangsAndClaws = fangsAndClaws;
	}

	// Getters and Setters
	public boolean isVenomous() {
		return this.venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}

	public boolean isPoisonous() {
		return this.poisonous;
	}

	public void setPoisonous(boolean poisonous) {
		this.poisonous = poisonous;
	}

	public boolean isFangsAndClaws() {
		return this.fangsAndClaws;
	}

	public void setFangsAndClaws(boolean fangsAndClaws) {
		this.fangsAndClaws = fangsAndClaws;
	}

	// Specific toString()
	public String toStringDan() {
		return "Dangerous [Venomous: " + venomous + ", Poisonous: " + poisonous + ", Fangs and claws: " + fangsAndClaws
				+ ", Terrain type()=" + getTerrainType() + ", Can you pet:" + isCanYouPet() + ", Eats: " + getEats()
				+ ", Vegetarian: " + isVegetarian() + ", Orgin: " + getOrgin() + ", Number of legs: "
				+ getNumberOfLegs() + "]";
	}

	// Methods
	@Override
	public void canYouPet() {
		if (isCanYouPet()) {
			System.out.println("Sure you can! You go first!");
		} else {
			System.out.println("Yes, but only once.");
		}
	}

	@Override
	public void doTrick() {
		if (venomous) {
			System.out.println("<Stings you>");
		} else if (poisonous) {
			System.out.println("<Stares at you in confusion>");
		} else if (fangsAndClaws) {
			System.out.println("<Bites you>");
		} else {
			System.out.println("This animal doesn't know any tricks!");
		}
	}

}