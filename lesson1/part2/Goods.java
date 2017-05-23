
public class Goods {

    private int id;
    private String name;
    private String category;
    private int weight;
    private String shelflife;
    private int packingdate;
    private String dimensions;
    private boolean fresh;
    private boolean smellsgood;

    public Goods(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    //get methods:
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getWeight() {
        return weight;
    }

    public String getShelflife() {
        return shelflife;
    }

    public int getPackingDate() {
        return packingdate;
    }

    public String getDimensions() {
        return dimensions;
    }

    //set methods:
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setShelflife(String shelflife) {
        this.shelflife = shelflife;
    }

    public void setWidth(int packingdate) {
        this.packingdate = packingdate;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    //boolean methods:
    public boolean isFresh() {
        return this.fresh;
    }

    public boolean isSmellsgood() {
        return this.smellsgood;
    }

    //actions with objects:
    public static void main(String args[]) {
        Goods object1 = new Goods(1990, "Milk", "Dairy");
        Goods object2 = new Goods(1488, "Banana", "Fruit");
        System.out.println("The short description of product: product_id=" + object1.getId() + "; name: " + object1.getName() +
                "; category: " + object1.getCategory());
        object2.setWeight(1500);
        object2.setShelflife("15 days");
        System.out.println("The weight of " + object2.getName() + " is " + object2.getWeight() +
                " gramms, and shelf life is " + object2.getShelflife());
    }

}
