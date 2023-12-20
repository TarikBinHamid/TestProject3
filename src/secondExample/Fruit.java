package secondExample;

public class Fruit {
    private String name;
    private String color;
    private double price;
    private boolean isSweet;

    Fruit(String name,double price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSweet() {
        return isSweet;
    }

    public void setSweet(boolean sweet) {
        isSweet = sweet;
    }
}
