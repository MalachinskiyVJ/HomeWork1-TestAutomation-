
public class MusicInstruments {

    private String name;
    private String type;
    private int year;
    private String colour;
    private int price;
    private String manufacturer;
    private String material;
    private String volume;

    public MusicInstruments(String name, String type, int year) {
        this.name = name;
        this.type = type;
        this.year = year;
    }

    //get methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public String getVolume() {
        return volume;
    }

    //set methods:
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    //actions with objects:
    public static void main(String args[]) {
        MusicInstruments object1 = new MusicInstruments("Piano", "keyboard", 1900);
        MusicInstruments object2 = new MusicInstruments("harpsichord", "keyboard", 1899);

        System.out.println(object1.getName() + " is the most popular " + object1.getType() + " music instrument");
        object2.setManufacturer("Antoni Hoffer");
        System.out.println("This " + object2.getName() + " was made by famous instrument maker " +
                object2.getManufacturer() + " in " + object2.getYear());
    }

}
