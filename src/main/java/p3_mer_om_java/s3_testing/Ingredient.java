package p3_mer_om_java.s3_testing;

import java.util.Objects;

public class Ingredient {
	private String name;

	public Ingredient(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Ingredient that = (Ingredient) obj;
		return Objects.equals(name, that.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return name;
	}
}
