public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple("Apple", 1, 15);

        Apple apple1 = new Apple("Apple", 2, 15);

        Pear pear = new Pear("Pear", 3, 12);

        Melon melon = new Melon("Melon", 4, 20);

        PayCheck payCheck = new PayCheck();
        payCheck.addToGoods(apple);
        payCheck.addToMapOfId(apple);

        payCheck.addToGoods(apple1);
        payCheck.addToMapOfId(apple1);

        payCheck.addToGoods(pear);
        payCheck.addToMapOfId(pear);

        payCheck.addToGoods(melon);
        payCheck.addToMapOfId(melon);


    }
}
