import java.util.*;

public class PayCheck extends Shop {

    private Map<Long, Item> mapOfId = new HashMap<>();
    private Map<String, Integer> check = new HashMap<>();
    private Map<Item, Integer> goods = new HashMap<>();
    private List<Item> listOfProducts = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayCheck payCheck = (PayCheck) o;
        return goods.equals(payCheck.goods) &&
                listOfProducts.equals(payCheck.listOfProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goods, listOfProducts);
    }

    public void addToMapOfId(Item item) {
        mapOfId.put(item.getId(), item);
    }

    public void addToGoods(Item item) {
        int goodsCount = 0;
        listOfProducts.add(item);
        if (mapOfId.containsValue(item)) {
            goodsCount++;
        } else {
            goodsCount = 1;
        }
        for (int i = 0; i < listOfProducts.size(); i++) {
            goods.put(listOfProducts.get(i), goodsCount);
        }
    }

    //public Map<String, Integer> formCheck() {

   // }
}


