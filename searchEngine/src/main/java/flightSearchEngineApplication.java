import java.util.ArrayList;

public class flightSearchEngineApplication {
    public static void main(String[] args) {
        Flight flight = new Flight( "Cracow", "Munich", 3500);
        FlightDatabase flightDatabase = new FlightDatabase();
        ArrayList<String> cities = flightDatabase.getCities();
        System.out.println("-------------------");
        System.out.println(cities);
        System.out.println("-------------------");
        System.out.println(flight.flightInformation());
        flight.displayFlightsFromCity();
        flight.displayFlightsToCity();
        System.out.println(flight.getPrice());
        System.out.println("tańszy lot: "+ flightDatabase.getCheapestFlaight());


    }
}
