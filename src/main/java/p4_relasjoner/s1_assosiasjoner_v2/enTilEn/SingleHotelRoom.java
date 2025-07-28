package p4_relasjoner.s1_assosiasjoner_v2.enTilEn;

public class SingleHotelRoom {

	private int roomNumber;
	private Guest guest;

	public SingleHotelRoom(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest newGuest) {
		if (this.guest == newGuest) {
			return;
		}

		Guest oldGuest = this.guest;
		this.guest = newGuest;

		if (oldGuest != null && oldGuest.getRoom() == this) {
			oldGuest.setRoom(null);
		}

		if (this.guest != null) {
			this.guest.setRoom(this);
		}
	}

	public boolean isOccupied() {
		return guest != null;
	}

	@Override
	public String toString() {
		if (guest == null) {
			return roomNumber + ": ingen beboer";
		}
		return roomNumber + ": " + guest.getName();
	}

	public static void main(String[] args) {
		Guest g1 = new Guest("Otto");
		Guest g2 = new Guest("Anna");

		SingleHotelRoom hr1 = new SingleHotelRoom(2);
		SingleHotelRoom hr2 = new SingleHotelRoom(13);

		g1.setRoom(hr1);
		g2.setRoom(hr2);

		System.out.println(g1);
		System.out.println(g2);
		System.out.println(hr1);
		System.out.println(hr2);

		System.out.println("\nOtto bytter rom og kaster ut Anna...\n");
		g1.setRoom(hr2);

		System.out.println(g1);
		System.out.println(g2);

		System.out.println(hr1);
		System.out.println(hr2);
	}

}