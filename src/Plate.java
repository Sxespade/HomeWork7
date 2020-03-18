import java.util.ArrayList;

public class Plate implements Subject  {

    Cat[] cats;
    ArrayList<Observer> catList;
    int food;

    public Plate(int food) {
        this.food = food;
        catList = new ArrayList<Observer>();
    }


    public Plate() {
        this(0);
    }

    public void addCat(Cat cat) {

    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int food) {
        this.food += food;
        notifyAllCats();
    }

    public void info() {
        System.out.println(this);
    }

    @Override
    public void decreaseFood (int foodCount) {
        if (food >= foodCount) {this.food -= foodCount; }
        else {
            System.out.println("В тарелке недостаточно еды");
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }

    @Override
    public void registerCat(Observer o) {
        catList.add(o);
    }

    @Override
    public void removeCat(Observer o) {
        catList.remove(o);
    }

    @Override
    public void notifyAllCats() {
        ArrayList<Observer> catList1 = new ArrayList<Observer>();
        for(Observer o: catList){
            o.update(this);
            if (o.getAppetite() != 0) {
                catList1.add(o);
            }
        }
        catList = catList1;
    }

}
