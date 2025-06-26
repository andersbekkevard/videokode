package p4_relasjoner.s1_assosiasjoner.enTilEn;

public class Guest {

    private String name;
    private HotelRoom room;

    public Guest(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    // Over kan være fra før

    public String getName() {
        return name;
    }

    public HotelRoom getRoom() {
        return room;
    }

    public void setName(String name) {
        this.name = name;
    }


    // Vis dette først og så problemene som følger
    // public void assignRoom(HotelRoom room) {
    //     this.room = room;
    // }

    // Denne kan løses veldig kort og elegenat rekursivt
    public void assignRoom(HotelRoom room) {

        if (this.room != null) {
            this.room.setGuest(null);
        }

        if (room.getGuest() != null) {
            room.getGuest().room = null;
        }

        this.room = room;
        room.setGuest(this);
    }


    @Override
    public String toString() {
        if (room == null) {
            return name + " har ikke et rom";
        }
        return name + " bor på " + room.getRoomName();
    }

    public static void main(String[] args) {
        Guest g1 = new Guest("Otto");
        Guest g2 = new Guest("Anna");

        HotelRoom hr1 = new HotelRoom("4-13");
        HotelRoom hr2 = new HotelRoom("2-8");

        g1.assignRoom(hr1);
        g2.assignRoom(hr2);

        System.out.println(g1);
        System.out.println(g2);


        System.out.println("\nOtto bytter rom og kaster ut Anna...\n");
        g1.assignRoom(hr2);

        System.out.println(g1);
        System.out.println(g2);

        System.out.println(hr1);
        System.out.println(hr2);

        // Fiks assignRoom

    }

}
