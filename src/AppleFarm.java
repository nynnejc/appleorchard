import java.util.ArrayList;
import java.util.Collections;

public class AppleFarm {
    private static ArrayList<Apple> inventory = new ArrayList<>();

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";


    public static void main(String[] args) {


        addApples();

        System.out.println(ANSI_PURPLE + "\nVelkommen til Æbleplantagens Inventarsystem!" + ANSI_RESET);

        System.out.println(ANSI_RED + "\nSæsonens Æbler:" + ANSI_RESET);
        viewInventory();

        sortByPrice();

        sortBySweetness();

        sortByName();

        sortByPrettiest();

    }

    private static void addApples() {
        inventory.add(new Apple("Honey Crisp", 3, 8.5, "Rød"));
        inventory.add(new Apple("Belle de Boskoop", 1, 6.2, "Grøn"));
        inventory.add(new Apple("Cox Orange", 2, 7.8, "Orange"));
        inventory.add(new Apple("Ingrid Marie", 3, 9.0, "Gul"));
        inventory.add(new Apple("Pigeon", 2, 7.0, "Pink"));
    }

    private static void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println(ANSI_BLUE + "Der er desværre ingen æbler i sæson lige nu." + ANSI_RESET);
        } else {
            for (Apple apple : inventory) {
                System.out.println(apple);
            }
        }
    }

    private static void sortByPrice() {
        Collections.sort(inventory);
        System.out.println(ANSI_GREEN + "\nÆbler sorteret efter pris pr styk:" + ANSI_RESET);
        viewInventory();
    }

    private static void sortBySweetness() {
        Collections.sort(inventory, new SweetnessComparator());
        System.out.println(ANSI_CYAN + "\nÆbler sorteret efter sødme:" + ANSI_RESET);
        viewInventory();
    }

    private static void sortByName() {
        Collections.sort(inventory, new NameComparator());
        System.out.println(ANSI_BLUE + "\nÆbler sorteret efter navn:" + ANSI_RESET);
        viewInventory();
    }

    private static void sortByPrettiest() {
        Collections.sort(inventory, new PrettiestComparator());
        System.out.println(ANSI_YELLOW + "\nÆbler sorteret efter flotteste:"+ ANSI_RESET);
        viewInventory();
    }
}
