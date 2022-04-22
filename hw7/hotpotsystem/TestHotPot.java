package hotpotsystem;

public class TestHotPot {
    public static void main(String args[]) {
        MuttonHotpotStore createMutton = new MuttonHotpotStore();
        HotPot mhp = createMutton.CreatHotPot();

        TripeHotPotStore createTripe = new TripeHotPotStore();
        HotPot thp = createTripe.CreatHotPot();

        Two_FlavouredHotPotStore createTwo_Flavoured = new Two_FlavouredHotPotStore();
        HotPot tfhp = createTwo_Flavoured.CreatHotPot();

        createTwo_Flavoured.introHotPot();
        createTwo_Flavoured.addIngredient("noodles");

        mhp.showPrice();
        mhp.getComments();

        thp.showPrice();
        thp.getComments();

        tfhp.showPrice();
        tfhp.getComments();
    }
}
