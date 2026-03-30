public class Bookmystay {
    public static void main(String[] args) {
        System.out.println("Booking Request Queue\n");

        // Initialize booking queue
        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Create booking requests (Arrival order: Abhi, Subha, Vanmathi)
        RoomReservation r1 = new RoomReservation("Abhi", "Single");
        RoomReservation r2 = new RoomReservation("Subha", "Double");
        RoomReservation r3 = new RoomReservation("Vanmathi", "Suite");

        // Add requests to the queue (FIFO - First In, First Out)
        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        // Display queued booking requests in the order they arrived
        int position = 1;
        while (bookingQueue.hasPendingRequests()) {
            RoomReservation current = bookingQueue.processNextRequest();
            System.out.println("Processing Request #" + (position++) + ":");
            System.out.println("Guest: " + current.getGuestName());
            System.out.println("Room Type: " + current.getRoomType());
            System.out.println("---------------------------");
        }
    }
}