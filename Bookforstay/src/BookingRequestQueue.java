import java.util.LinkedList;
import java.util.Queue;

class BookingRequestQueue {
    private Queue<RoomReservation> queue = new LinkedList<>();

    public void addRequest(RoomReservation request) {
        queue.add(request);
    }

    public boolean hasPendingRequests() {
        return !queue.isEmpty();
    }

    public RoomReservation processNextRequest() {
        return queue.poll();
    }
}
