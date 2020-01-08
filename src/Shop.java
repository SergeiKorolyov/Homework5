import java.util.*;

public class Shop {
    private List<Item> listOfProducts = new ArrayList<>();
    private List<Long> listOfId = new ArrayList<>();
    private Map<String, Integer> payCheck = new LinkedHashMap<>();

    public List<Item> addProduct(Item item) {
        listOfProducts.add(item);
        return listOfProducts;
    }

    public List<Long> formIdList() {
        for (int i = 0; i < listOfProducts.size(); i++) {
            long id = listOfProducts.get(i).getId();
            listOfId.add(id);
        }
        return listOfId;
    }

    public Map<String, Integer> formPayCheck(List<Long> listOfId) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < listOfProducts.size(); i++) {
            if (listOfProducts.get(i).getId() == listOfId.get(i)) {
                counter++;
                payCheck.put(listOfProducts.get(i).getName(), counter);
            }
            if (0 < i && i < listOfProducts.size() - 1 && listOfProducts.get(i).getName() != listOfProducts.get(i + 1).getName()) {
                counter = 0;
            }
        }
        for (int j = 0; j < listOfProducts.size(); j++) {
            sum += listOfProducts.get(j).getPrice();
        }
        payCheck.put("Total", sum);
        return payCheck;
    }

    public void printProducts() {
        System.out.println(listOfProducts);
    }

    public void printId() {
        System.out.println(listOfId);
    }

    public void printCheck() {
        System.out.println(payCheck);
    }
}

