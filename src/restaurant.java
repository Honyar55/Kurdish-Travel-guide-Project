public class restaurant extends recommendation {
    private String address;
    private double rating;
    private String cuisine;

    public restaurant(String name, String address, double rating, String cuisine) {
        super(name);
        this.address = address;
        this.rating = rating;
        this.cuisine = cuisine;
    }

    @Override
    public void displayinfo() {
        System.out.println("Restaurant: " + name + " | Address: " + address + " | Rating: " + rating + " stars | Cuisine: " + cuisine);
    }
}



