public class Cat implements Observer {

    private final String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getAppetite() {
        return appetite;
    }

    private void doEat(Subject s) {
        s.decreaseFood(appetite);
    }


    @Override
    public void update(Subject s) {
        System.out.println(this.name + " был оповещен!");
        //print job list
        System.out.println(s);
        System.out.println("Кот аппетит: " + appetite);
        eat(s);


    }

    @Override
    public void eat(Subject s) {
        if (s.getFood() >= appetite) {
            satiety = true;
            doEat(s);
            System.out.println("Кот наелся и ушел. Сытость: " + satiety);
            appetite = 0;
        } else {
//            Thread.sleep(1000);
            int m = appetite;
            appetite = appetite - s.getFood();
            //  appetite -= foodEat;
            //  plate.decreaseFood(foodEat);
            s.decreaseFood(s.getFood());
            satiety = false;
            System.out.println("Кот остался недоволен! " + "Неудовлетворенный аппетит после последней трапезы: " + appetite + " . В тарелке 0. Сытость кота: " + satiety);
            appetite = m;
        }


    }
}

