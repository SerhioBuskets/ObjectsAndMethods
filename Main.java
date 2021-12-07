public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 80, 8, 1.2);
        basket.print("Корзина");
        basket.getTotalWeight();
    }
}
