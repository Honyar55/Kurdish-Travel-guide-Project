public class place extends recommendation {
    private String address;
    private String description;

    public place(String name, String address, String description) {
        super(name);
        this.address = address;
        this.description = description;
    }

    @Override
    public void displayinfo() {
        System.out.println("Place: " + name + " | Address: " + address + " | Description: " + description);
    }
}


