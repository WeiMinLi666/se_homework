package hotpotsystem;

public class MuttonHotpotStore extends HotPotStore{
    @Override
    public HotPot CreatHotPot() {
         return new MuttonHotPot();
    }

}
