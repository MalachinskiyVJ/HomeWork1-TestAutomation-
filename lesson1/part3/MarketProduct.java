public class MarketProduct {
    private int price;
    private int id;

    public void setPrice(int Price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int Id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

class Food extends MarketProduct {
    private String size;
    private double weight;

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

class Fruit extends Food {
    private String smell;
    private String taste;

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }
}

class Apple extends Fruit {
    private String form;
    private String colour;

    public void setForm(String form) {
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public static void main(String args[]) {
        Apple apple = new Apple();
        apple.setColour("red");
        apple.setSize("big");
        apple.setWeight(1.5);
        apple.setPrice(5);
        System.out.println("I like " + apple.getColour() + " and " + apple.getSize() + " apples");
        System.out.println("Give me " + apple.getWeight() + " kilograms of apples for " + apple.getPrice() + " dollars");
    }
}