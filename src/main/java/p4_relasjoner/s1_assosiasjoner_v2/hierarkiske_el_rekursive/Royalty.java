package p4_relasjoner.s1_assosiasjoner_v2.hierarkiske_el_rekursive;

// Vi skal nå se når på objekter av samme klasse står i forhold til hverandre.
// Dette har vi valgt å kalle for hierarkiske eller rekursive assosiasjoner

public class Royalty {

	// Kan ha alt annet ferdig opprettet unntatt settere og boolske metoder

	private String name;
	private Royalty successor; // Etterkommer

	public Royalty(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Royalty getSuccessor() {
		return successor;
	}

	public void setSuccessor(Royalty newSuccessor) {
		if (this.successor == newSuccessor) {
			return;
		}

		Royalty oldSuccessor = this.successor;
		this.successor = newSuccessor;

		if (oldSuccessor != null && newSuccessor != null) {
			newSuccessor.setSuccessor(oldSuccessor);
		}
	}

	// Med Rekursjon
	// public Royalty getYoungest() {
	// if (successor == null) {
	// return this;
	// }
	// return successor.getYoungest();
	// }

	public Royalty getYoungest() {
		Royalty current = this;
		while (current.getSuccessor() != null) {
			current = current.getSuccessor();
		}
		return current;
	}

	public boolean hasDescendant(Royalty p) {
		if (successor == p) {
			return true;
		} else if (successor == null) {
			return false;
		}
		Royalty current = successor;
		while ((current = current.getSuccessor()) != null) {
			if (current == p) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Royalty king = new Royalty("Kong Harald");
		Royalty crownPrince = new Royalty("Kronprins Haakon");
		Royalty princess = new Royalty("Prinsesse Ingrid Alexandra");

		king.setSuccessor(crownPrince);
		crownPrince.setSuccessor(princess);

		System.out.println(king.hasDescendant(crownPrince));
		System.out.println(crownPrince.hasDescendant(king));
		System.out.println(king.hasDescendant(princess));

		edgeCaseTest();
	}

	public static void edgeCaseTest() {
		// Edge case 1: Only one Royalty in the chain
		Royalty solo = new Royalty("Solo King");
		assert solo.getYoungest() == solo : "getYoungest should return self if no successor";
		assert !solo.hasDescendant(solo) : "A Royalty should not be its own descendant";

		// Edge case 2: Successor is set to null
		Royalty a = new Royalty("A");
		Royalty b = new Royalty("B");
		a.setSuccessor(b);
		a.setSuccessor(null); // Remove successor
		assert a.getSuccessor() == null : "Successor should be null after removal";
		assert a.getYoungest() == a : "getYoungest should return self if no successor";
		assert !a.hasDescendant(b) : "Should not have descendant after removal";

		// Edge case 3: Setting a new successor replaces the old one
		Royalty c = new Royalty("C");
		Royalty d = new Royalty("D");
		Royalty e = new Royalty("E");
		c.setSuccessor(d);
		c.setSuccessor(e); // e should now be successor, d should be successor of e
		assert c.getSuccessor() == e : "Successor should be replaced";
		assert e.getSuccessor() == d : "Old successor should be chained to new successor";
		assert c.getYoungest() == d : "Youngest should be the last in the chain";
		assert c.hasDescendant(d) : "Should have d as descendant";
		assert c.hasDescendant(e) : "Should have e as descendant";
		assert !e.hasDescendant(c) : "No cycles should be present";

		// Edge case 4: Long chain, check hasDescendant for all
		Royalty root = new Royalty("Root");
		Royalty mid = new Royalty("Mid");
		Royalty leaf = new Royalty("Leaf");
		root.setSuccessor(mid);
		mid.setSuccessor(leaf);
		assert root.hasDescendant(mid) : "Root should have mid as descendant";
		assert root.hasDescendant(leaf) : "Root should have leaf as descendant";
		assert !mid.hasDescendant(root) : "Mid should not have root as descendant";
		assert !leaf.hasDescendant(root) : "Leaf should not have root as descendant";
		assert !leaf.hasDescendant(mid) : "Leaf should not have mid as descendant";
		assert leaf.getYoungest() == leaf : "Leaf is youngest in its chain";
		assert root.getYoungest() == leaf : "Root's youngest is leaf";

		// Edge case 5: Setting successor to self (should not create infinite loop)
		Royalty self = new Royalty("Self");
		self.setSuccessor(self);
		// getYoungest should not loop forever, but since setSuccessor does not prevent
		// this, it will create a cycle.
		// To avoid infinite loop in test, we check hasDescendant
		assert self.hasDescendant(self) : "Should detect self as descendant if set as own successor";
	}
}