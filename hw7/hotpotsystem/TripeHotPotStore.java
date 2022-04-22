package hotpotsystem;

public class TripeHotPotStore extends HotPotStore{

    @Override
    public HotPot CreatHotPot() {
        return new TripeHotPot();
    }
}
