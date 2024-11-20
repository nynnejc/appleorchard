public class Apple implements Comparable<Apple> {
    private String name;
    private int price;
    private double sweetness;
    private String color;

    public Apple(String name, int price, double sweetness, String color) {
        this.name = name;
        this.price = price;
        this.sweetness = sweetness;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getSweetness() {
        return sweetness;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("Navn: %s, Pris: %d kr, Sødme: %.1f, Farve: %s",
                name, price, sweetness, color);
    }


    @Override
    public int compareTo(Apple other) {
        return Integer.compare(this.price, other.price);
    }
}
