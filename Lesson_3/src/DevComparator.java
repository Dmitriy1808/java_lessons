import java.util.Comparator;

public class DevComparator implements Comparator<Developer> {

    @Override
    public int compare(Developer developer, Developer t1) {
        return Integer.compare(developer.getName().length(), t1.getName().length());
    }
}
