import java.util.ArrayList;
import java.util.List;


public class FlightDatabase {
    ArrayList<Flight> flightArrayList = new ArrayList<Flight>();

    public FlightDatabase() {
        this.flightArrayList.add( new Flight( "Warsaw", "London" ,1500) );
        this.flightArrayList.add( new Flight( "Lodz", "Amsterdam",1800 ) );
        this.flightArrayList.add( new Flight( "Barcelona", "Cracow" ,900) );
        this.flightArrayList.add( new Flight( "Berlin", "Paris" ,2250) );
        this.flightArrayList.add( new Flight( "Rzeszow", "Geneva",3500 ) );
        this.flightArrayList.add( new Flight( "Moscow", "Wroclaw" ,800) );
        this.flightArrayList.add( new Flight( "Cracow", "Munich" ,1250) );
    }

    public ArrayList<String> getCities() {
        ArrayList<String> cities = new ArrayList<>();
        for (int i = 0; i < this.flightArrayList.size(); i++) {
            Flight flight = this.flightArrayList.get( i );
            if (!cities.contains( flight.getDeparture() )) {
                cities.add( flight.getDeparture() );
            }
            if (!cities.contains( flight.getArrival() )) {
                cities.add( flight.getArrival() );
            }
        }
        return cities;
    }
    public Flight getCheapestFlaight(){
        Flight cheapestFlaight = null;
        for (Flight flight: this.flightArrayList){
            if (cheapestFlaight == null || flight.getPrice() < cheapestFlaight.getPrice()){
                cheapestFlaight = flight;
            }
        }
        return cheapestFlaight;
    }

    }


