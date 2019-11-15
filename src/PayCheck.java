import java.util.HashMap;
import java.util.Map;

public class PayCheck{

    private Map<Item, Integer> payCheck = new HashMap<>();

    public void putToPaycheck(Item item, Integer value){
        payCheck.put(item, value);


    }

}
