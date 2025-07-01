package p4_relasjoner.s1_assosiasjoner.enTilEn;

public class SingleHotelRoom {

    private String roomName;
    private Guest guest;

    public SingleHotelRoom(String roomName) {
        if (roomName == null || roomName.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.roomName = roomName;
    }

    // Over kan være inne fra start

    public String getRoomName() {
        return roomName;
    }

    public void setGuest(Guest student) {
        this.guest = student;
    }

    public Guest getGuest() {
        return guest;
    }

    @Override
    public String toString() {
        if (guest == null) {
            return roomName + ": ingen beboer";
        }
        return roomName + ": " + guest.getName();
    }

}
