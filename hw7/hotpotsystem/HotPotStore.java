package hotpotsystem;

public abstract class  HotPotStore {
    public abstract HotPot CreatHotPot();
    public void introHotPot(){
        System.out.println("HotPot is a traditional food in China");
    }
    public void addIngredient(String s){
        System.out.println("We will add "+s+" to you");
    }
}
