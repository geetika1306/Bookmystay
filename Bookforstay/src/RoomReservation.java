public class RoomReservation {
    private String guestName;
    private String roomType;

    public RoomReservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() {
        return guestName;
    }
    public String getRoomType() { return roomType; }
}
