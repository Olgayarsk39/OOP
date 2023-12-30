package Work_2;

public class Work_2 {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Посетитель 1");
        Human human2 = new Human("Посетитель 2");
        Human human3 = new Human("Посетитель 3");

        market.acceptToMarket(human2);
        market.acceptToMarket(human1);
        market.acceptToMarket(human3);
        market.update();
    }
}
