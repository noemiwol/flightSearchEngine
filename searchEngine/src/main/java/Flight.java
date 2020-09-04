public class Flight {
   private String departure;
   private String arrival;

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", price=" + price +
                '}';
    }

    public Flight(String departure, String arrival, int price) {
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    private int price;



    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String flightInformation(){
        return "Flight from: " + this.departure + " to: " + this.arrival + " costs: " + this.price;
    }
    public  String displayFlightsFromCity(){
        return this.departure;
    }

    public String displayFlightsToCity(){
        return  this.arrival;
    }

    public  int displayFlightsPrice(){
        return this.price;
    }


    }




