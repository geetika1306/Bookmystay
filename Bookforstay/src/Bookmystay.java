import java.util.ArrayList;
import java.util.List;
public class Bookmystay {

    public static void main(String[] args) {
        // Display application header
        System.out.println("Booking History and Reporting\n");

        BookingHistory history = new BookingHistory();

        // Simulating confirmed bookings being added to history
        history.addReservation(new RoomReservation("Abhi", "Single"));
        history.addReservation(new RoomReservation("Subha", "Double"));
        history.addReservation(new RoomReservation("Vanmathi", "Suite"));

        // Generate and display the report
        BookingReportService reportService = new BookingReportService();
        reportService.generateReport(history);
    }
}