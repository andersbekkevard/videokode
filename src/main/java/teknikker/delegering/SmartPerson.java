package teknikker.delegering;

import java.util.ArrayList;
import java.util.List;

public class SmartPerson {
	private String name;
	private List<SmartPerson> friends = new ArrayList<>();

	public SmartPerson(String name) {
		this.name = name;
	}

	public void addFriend(SmartPerson friend) {
		friends.add(friend);
		friend.friends.add(this);
	}

	public String getName() {
		return name;
	}

	public List<SmartPerson> getFriends() {
		return friends;
	}

	public static void main(String[] args) {
		SmartPerson Kristian = new SmartPerson("Kristian");
		SmartPerson Anne = new SmartPerson("Anne");

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