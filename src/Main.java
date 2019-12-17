public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple("Apple", 1, 15);

        Apple apple1 = new Apple("Apple", 2, 15);

        Apple apple2 = new Apple("Apple", 2, 15);

        Pear pear = new Pear("Pear", 3, 12);

        Melon melon = new Melon("Melon", 4, 20);
        Melon melon1 = new Melon("Melon", 4, 20);

        PayCheck payCheck = new PayCheck();
        Shop shop = new Shop();

        payCheck.addToGoods(apple);

        payCheck.addToGoods(apple1);

        payCheck.addToGoods(pear);

        payCheck.addToGoods(melon);

        payCheck.addToGoods(melon1);

        payCheck.getPaycheck();
    }
}
