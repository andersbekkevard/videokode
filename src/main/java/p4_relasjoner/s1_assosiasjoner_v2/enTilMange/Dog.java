package p4_relasjoner.s1_assosiasjoner_v2.enTilMange;

public class Dog {

	private String name;
	private Owner owner;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner newOwner) {
		if (this.owner == newOwner) {
			return;
		}

		// fjerner gammel tilkobling
		if (this.owner != null) {
			this.owner.removeDog(this);
		}

		// setter ny tilkobling begge veier
		this.owner = newOwner;
		if (this.owner != null) {
			this.owner.addDog(this);
		}
	}

	@Override
	public String toString() {
		if (owner == null) {
			return this.name + " har ingen eier";
		}
		return this.name + " sin eier er " + this.owner.getName();
	}

}