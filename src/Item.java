import java.util.Objects;

public abstract class Item {
    private String name;
    private long id;
    private int price;

    public Item(String name, long id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id &&
                price == item.price &&
                Objects.equals(name, item.name);
    }

    @Override
    public String toString() {
        return "Item{" +
                name +
                ", id " + id +
                ", price " + price +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, price);


    }
}
