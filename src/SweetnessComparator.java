import java.util.Comparator;

public class SweetnessComparator implements Comparator<Apple> {
    @Override
    public int compare(Apple a1, Apple a2) {
        return Double.compare(a2.getSweetness(), a1.getSweetness());
    }
}
