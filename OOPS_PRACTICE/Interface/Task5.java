// Scenario 5: Travel Booking System
// Develop an interface called "TravelBooking" with methods like "bookTicket" and "cancelBooking." Implement classes like "FlightBooking" and "HotelBooking" that provide specific implementations for these interface methods.

interface TravelBooking {
    void bookTicket(String bookingDetails);

    void cancelBooking(String bookingId);
}

class FlightBooking implements TravelBooking {

    @Override
    public void bookTicket(String bookingDetails) {
        System.out.println("Booking flight ticket: " + bookingDetails);
    }

    @Override 
    public cancelBooking(String bookingId){
        System.out.println("Cancel flight booking: "+bookingId);
    }
}

public class HotelBooking implements TravelBooking {

    @Override
    public void bookTicket(String bookingDetails) {
        System.out.println("Booking hotel room: " + bookingDetails);
    }

    @Override
    public void cancelBooking(String bookingId) {
        System.out.println("Cancelling hotel booking: " + bookingId);
    }
}

public class Task5 {
    public static void main(String[] args) {
        TravelBooking flightBooking = new FlightBooking();
        TravelBooking hotelBooking = new HotelBooking();
        
    
    }
}
