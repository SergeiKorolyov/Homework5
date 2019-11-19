import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {

    private List<Item> itemList = new ArrayList<>();
    private Map<String, Integer> goodsList = new HashMap<>();

    public void addToItemList(Item item) {
        itemList.add(item);
    }

    public Map<String, Integer> getGoodsList() {
        return goodsList;
    }

    public Map<String, Integer> formCheck(List<Integer> id) {

        int valueOfApple = 0;
        int valueOfPear = 0;
        int valueOfMelon = 0;

        Apple a = new Apple();
        Pear p = new Pear();
        Melon m = new Melon();

        for (int i = 0; i < id.size(); i++) {
            if (a.getId() == id.get(i)){
                valueOfApple++;
                goodsList.put(a.getName(), valueOfApple);
            }
            if (p.getId() == id.get(i)){
                valueOfPear++;
               goodsList.put(p.getName(), valueOfPear);
            }
            if (m.getId() == id.get(i)){
                valueOfMelon++;
                goodsList.put(m.getName(), valueOfMelon);
            }
        }
        return goodsList;
    }



}

