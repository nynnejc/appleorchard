import java.util.Comparator;

public class NameComparator implements Comparator<Apple> {
    @Override
    public int compare(Apple a1, Apple a2) {
        return a1.getName().compareToIgnoreCase(a2.getName());
    }
}
