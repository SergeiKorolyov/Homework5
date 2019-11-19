import java.util.HashMap;
import java.util.Map;

public class PayCheck {

    private Map<Item, Integer> payCheck = new HashMap<>();



    public Map<String, Integer> payCheck(Map<String, Integer> formedCheck) {
        Map<String, Integer> preCheck = new HashMap<>();

        int totalCostOfApple = 0;
        int totalCostOfPear = 0;
        int totalCostOfMelon = 0;

        Apple a = new Apple();
        Pear p = new Pear();
        Melon m = new Melon();

        for (int i = 0; i < formedCheck.size(); i++) {
            if (a instanceof Apple) {
                totalCostOfApple = a.getPrice() * formedCheck.get(a.getName());
            }
            if (p instanceof Pear) {
                totalCostOfPear = p.getPrice() * formedCheck.get(p.getName());
            }
            if (m instanceof Melon) {
                totalCostOfMelon = p.getPrice() * formedCheck.get(p.getName());
            }
            int totalSum = totalCostOfApple + totalCostOfMelon + totalCostOfPear;
            preCheck.put("Total", totalSum);

            preCheck.putAll(formedCheck);
        }
        return preCheck;
    }

}

