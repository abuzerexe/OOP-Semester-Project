import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
        System.out.println(item + " added to the repository.");
    }

    public void remove(T item) {
        if (items.remove(item)) {
            System.out.println(item + " removed from the repository.");
        } else {
            System.out.println("Item not found in repository.");
        }
    }

    public List<T> getAll() {
        return new ArrayList<>(items);
    }
}

