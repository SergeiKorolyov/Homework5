import java.util.*;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple();

        Apple apple1 = new Apple();

        Pear pear = new Pear();

        Melon melon = new Melon();

        Shop itemList = new Shop();
        itemList.addToItemList(apple);
        itemList.addToItemList(pear);
        itemList.addToItemList(melon);
        itemList.addToItemList(apple1);



        List<Integer> id = new ArrayList<>();
        id.add(1);
        id.add(1);
        id.add(2);
        id.add(3);
        id.add(3);
        System.out.println(itemList.formCheck(id));

        PayCheck payCheck = new PayCheck();
        System.out.println(payCheck.getPayCheck(itemList.getGoodsList()));
    }
}
