package hotpotsystem;

public class Two_FlavouredHotPot implements HotPot {
    @Override
    public void showPrice() {
        System.out.println("The two_flavouredhotpot costs 250$");
    }
    @Override
    public void getComments() {
        System.out.println("The two_flavouredhotpot is fantistic");
    }
}
