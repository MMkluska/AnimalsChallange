package qa.com.challange;

public class Wild extends Animals {

	private String terrainType;
	private boolean canYouPet;
	private String nameIt;

	// Constructors
	public Wild() {

	}

	public Wild(String eats, boolean vegetarian, String orgin, int numberOfLegs, String terrainType,
			boolean canYouPet) {
		super(eats, vegetarian, orgin, numberOfLegs);
		this.terrainType = terrainType;
		this.canYouPet = canYouPet;
	}

	// Getters and Setters
	public String getTerrainType() {
		return this.terrainType;
	}

	public void setTerrainType(String terrainType) {
		this.terrainType = terrainType;
	}

	public boolean isCanYouPet() {
		return this.canYouPet;
	}

	public void setCanYouPet(boolean canYouPet) {
		this.canYouPet = canYouPet;
	}

	public String getNameIt() {
		return this.nameIt;
	}

	public void setNameIt(String nameIt) {
		this.nameIt = nameIt;
	}

	// Specific toString()
	public String toStringWild() {
		return "Wild [Terain Type: " + terrainType + ", Can you pet: " + canYouPet + ", Eats: " + getEats()
				+ ", Is it vegetarian: " + isVegetarian() + ", Orgin: " + getOrgin() + ", Number of legs: "
				+ getNumberOfLegs() + "]";
	}

	// Methods
	@Override
	public void canYouPet() {
		if (isCanYouPet()) {
			System.out.println("You can try!");
		} else {
			System.out.println("No. It is wild animal");
		}
	}

	public void nameIt(String name) {
		setNameIt(name);
		System.out.println("I will name you " + getNameIt());
	}

}
