package hotpotsystem;

public class MuttonHotPot implements HotPot {

    @Override
    public void showPrice() {
        System.out.println("The muttonhotpot costs 250$");
    }

    @Override
    public void getComments() {
        System.out.println("The muttonhotpot is very taste");
    }
}
