public class activity extends recommendation {
    private String description;
    private int duration; // Duration in hours

    public activity(String name, String description, int duration) {
        super(name);
        this.description = description;
        this.duration = duration;
    }

    @Override
    public void displayinfo() {
        System.out.println("Activity: " + name + " | Description: " + description + " | Duration: " + duration + " hours");
    }
}


