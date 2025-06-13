package teknikker.delegering;

import java.util.ArrayList;
import java.util.List;

public class DumbPerson {
	private String name;
	private DumbPerson friend1;
	private DumbPerson friend2;
	private DumbPerson friend3;
	private DumbPerson friend4;

	public DumbPerson(String name) {
		this.name = name;
	}

	public void addFriend(DumbPerson friend) {
		if (friend1 == null) {
			friend1 = friend;
		} else if (friend2 == null) {
			friend2 = friend;
		} else if (friend3 == null) {
			friend3 = friend;
		} else if (friend4 == null) {
			friend4 = friend;
		} else {
			throw new IllegalArgumentException("Personen har allerede fire venner");
		}
	}

	public String getName() {
		return name;
	}

	public List<DumbPerson> getFriends() {
		List<DumbPerson> friends = new ArrayList<>();
		if (friend1 != null) {
			friends.add(friend1);
		}
		if (friend2 != null) {
			friends.add(friend2);
		}
		if (friend3 != null) {
			friends.add(friend3);
		}
		if (friend4 != null) {
			friends.add(friend4);
		}
		return friends;
	}

	public static void main(String[] args) {
		DumbPerson Kristian = new DumbPerson("Kristian");
		DumbPerson Anne = new DumbPerson("Anne");

		Kristian.addFriend(Anne);
		Anne.addFriend(Kristian);

		System.out.println(Kristian.getFriends());
		System.out.println(Anne.getFriends());
	}

	@Override
	public String toString() {
		return name;
	}
}