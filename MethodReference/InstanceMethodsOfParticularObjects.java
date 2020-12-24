import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BicycleComparator implements Comparator<Bicycle> {

    @Override
    public int compare(Bicycle a, Bicycle b) {
        return a.get_frame_size().compareTo(b.get_frame_size());
    }
    
}

public class InstanceMethodsOfParticularObjects {

    public static void main(String []args) {
        BicycleComparator bike_frame_size_comparator = new BicycleComparator();
        List<Bicycle> bicycle_list = new ArrayList<Bicycle>();
        bicycle_list.stream().sorted((a, b) -> bike_frame_size_comparator.compare(a, b) );
        bicycle_list.stream().sorted(bike_frame_size_comparator::compare);

        for (Bicycle bike : bicycle_list) {
            System.out.println(bike.get_frame_size());
        }
    }
    
}
