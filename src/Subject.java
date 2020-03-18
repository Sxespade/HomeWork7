public interface Subject {


    public int getFood();
    public void registerCat(Observer o);
    public void removeCat(Observer o);
    public void notifyAllCats();
    public void decreaseFood(int foodCount);

}
