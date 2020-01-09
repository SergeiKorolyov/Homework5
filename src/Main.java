public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple("Apple", 1, 15);

        Apple apple1 = new Apple("Apple", 2, 15);

        Apple apple2 = new Apple("Apple", 2, 15);

        Pear pear = new Pear("Pear", 3, 12);

        Melon melon = new Melon("Melon", 4, 20);
        Melon melon1 = new Melon("Melon", 4, 20);


        Shop shop = new Shop();

        shop.addProduct(apple);
        shop.addProduct(apple1);
        shop.addProduct(apple2);
        shop.addProduct(pear);
        shop.addProduct(melon);
        shop.addProduct(melon1);
        shop.formPayCheck(shop.formIdList());

    }
}
