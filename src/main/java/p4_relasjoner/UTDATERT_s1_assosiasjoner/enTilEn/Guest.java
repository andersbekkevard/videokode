package p4_relasjoner.UTDATERT_s1_assosiasjoner.enTilEn;

public class Guest {

    private String name;
    private SingleHotelRoom room;

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

    public SingleHotelRoom getRoom() {
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
    public void assignRoom(SingleHotelRoom room) {

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

        SingleHotelRoom hr1 = new SingleHotelRoom("4-13");
        SingleHotelRoom hr2 = new SingleHotelRoom("2-8");

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
