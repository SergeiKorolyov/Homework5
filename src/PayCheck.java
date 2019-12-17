import java.util.*;

public class PayCheck{

    private Map<Long, Item> mapOfId = new HashMap<>();
    private Map<String, Integer> check = new HashMap<>();
    private Map<Item, Integer> goods = new HashMap<>();
    private List<Item> listOfProducts = new ArrayList<>();
    private int goodsCount = 1;


    public Map<Item, Integer> addToGoods(Item item) {
        mapOfId.put(item.getId(), item);
        listOfProducts.add(item);
        for (int i = 0; i < listOfProducts.size(); i++) {
            if (listOfProducts.get(i).getId() == item.getId()) {
                goodsCount++;
            }
            goods.put(listOfProducts.get(i), goodsCount);
            goodsCount = 1;
        }
        return goods;
    }

    private Map<String, Integer> calculateTotalCost() {
        int itemTotalCost = 0;
        int totalCost = 0;
        Set setOfItem = new HashSet();
        setOfItem.addAll(listOfProducts);
        List<Item> noDuplicates = new ArrayList<>();
        noDuplicates.addAll(setOfItem);
        for (int i = 0; i < goods.size(); i++) {
            itemTotalCost = noDuplicates.get(i).getPrice() * goods.get(noDuplicates.get(i));
            totalCost += itemTotalCost;
        }
        check.put("Total", totalCost);
        return check;
    }

    public void getPaycheck() {
        System.out.println(goods);
        System.out.println(calculateTotalCost());
    }

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
}


