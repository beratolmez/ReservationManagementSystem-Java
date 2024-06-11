
package rezervasyon.uygulamasi;

public class Personel extends Person {
    private int price;

    public Personel(String firstName, String lastName, int price) {
        super(firstName, lastName);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}