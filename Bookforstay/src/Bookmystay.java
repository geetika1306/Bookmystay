import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class Bookmystay {
    public static void main(String[] args) {
        System.out.println("Room Allocation Processing");
        System.out.println("---------------------------");

        // Setup Queue (from Use Case 5)
        Queue<RoomReservation> bookingQueue = new LinkedList<>();
        bookingQueue.add(new RoomReservation("Abhi", "Single"));
        bookingQueue.add(new RoomReservation("Subha", "Single"));
        bookingQueue.add(new RoomReservation("Vanmathi", "Single")); // This should fail as we only have 2

        // Setup Allocation Service
        RoomAllocationService service = new RoomAllocationService();

        // Process requests in FIFO order
        while (!bookingQueue.isEmpty()) {
            service.processBooking(bookingQueue.poll());
        }
        System.out.println("---------------------------");
    }
}
