package hotpotsystem;

public class Two_FlavouredHotPotStore extends HotPotStore{
    @Override
    public HotPot CreatHotPot() {
        return new Two_FlavouredHotPot();
    }
}
