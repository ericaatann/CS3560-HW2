import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<watch> watches;

    public Person(String name){
        this.name = name;
        this.watches = new ArrayList<>();
    }

    public void addWatch(watch w){
        this.watches.add(w);
        w.setPerson(this);
    }
}
