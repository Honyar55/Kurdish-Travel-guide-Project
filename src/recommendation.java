public abstract class recommendation {
    protected String name;

    public recommendation(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public abstract void displayinfo();
}



