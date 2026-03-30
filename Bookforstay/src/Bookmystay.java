import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Bookmystay {
    public static void main(String[] args) {
        System.out.println("Concurrent Booking Simulation\n");

        BookingRequestQueue bookingQueue = new BookingRequestQueue();
        bookingQueue.addRequest(new RoomReservation("Abhi", "Single"));
        bookingQueue.addRequest(new RoomReservation("Vanmathi", "Double"));
        bookingQueue.addRequest(new RoomReservation("Kural", "Suite"));
        bookingQueue.addRequest(new RoomReservation("Subha", "Single"));

        RoomInventory inventory = new RoomInventory();
        RoomAllocationService allocationService = new RoomAllocationService();

        Thread t1 = new Thread(new ConcurrentBookingProcessor(bookingQueue, inventory, allocationService));
        Thread t2 = new Thread(new ConcurrentBookingProcessor(bookingQueue, inventory, allocationService));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread execution interrupted.");
        }

        System.out.println();
        inventory.printRemainingInventory();
    }
}