package hotpotsystem;

public class TripeHotPot implements HotPot {
    @Override
    public void showPrice() {
        System.out.println("The TripeHotPot costs 200$");
    }
    @Override
    public void getComments() {
        System.out.println("The TripeHotPot is a little fatty");
    }
}
