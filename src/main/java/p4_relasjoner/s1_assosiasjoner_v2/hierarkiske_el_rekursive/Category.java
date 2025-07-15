package p4_relasjoner.s1_assosiasjoner_v2.hierarkiske_el_rekursive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Category {

	private String name;
	private Category parent;
	private Collection<Category> children = new ArrayList<>();

	public Category(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Category getParent() {
		return parent;
	}

	public Collection<Category> getChildren() {
		return List.copyOf(children);
	}

	public boolean isChildOf(Category parent) {
		if (this.parent == parent) {
			return true;
		}
		if (this.parent == null) {
			return false;
		}
		return this.parent.isChildOf(parent);
	}

	public void setParent(Category newParent) {
		if (this.parent == newParent) {
			return;
		}

		// fjerner gammel tilkobling
		if (this.parent != null) {
			this.parent.removeChild(this);
		}

		// setter ny tilkobling begge veier
		this.parent = newParent;
		if (this.parent != null) {
			this.parent.addChild(this);
		}
	}

	public void addChild(Category child) {
		// Sjekker om allerede finnes kobling
		if (children.contains(child)) {
			return;
		}
		// Setter kobling
		children.add(child);
		// Sjekker om må sette kobling tilbake
		if (child.getParent() != this) {
			child.setParent(this);
		}
	}

	public void removeChild(Category child) {
		// Sjekker om kobling allerede ikke finnes
		if (!children.contains(child)) {
			return;
		}
		// Fjerner kobling
		children.remove(child);
		// Sjekker om må fjerne kobling tilbake
		if (child.getParent() == this) {
			child.setParent(null);
		}
	}

	public static void main(String[] args) {
	}
}
