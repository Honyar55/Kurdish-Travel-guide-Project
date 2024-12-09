public class hotel extends recommendation {
    private String address;
    private double rating;
    private double price;

    public hotel(String name, String address, double rating, double price) {
        super(name);
        this.address = address;
        this.rating = rating;
        this.price = price;
    }

    @Override
    public void displayinfo() {
        System.out.println("Hotel: " + name + " | Address: " + address + " | Rating: " + rating + " stars | Price: $" + price + " per night");
    }
}



