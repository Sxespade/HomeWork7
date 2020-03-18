public class Test7 {

    public static void main(String[] args) {
        Cat cat1 = new Cat ("Мартин", 4);
        Cat cat2 = new Cat ("Лионель",3);
        Cat cat3 = new Cat ("Дэвид",3);
        Cat cat4 = new Cat ("Кристиан",5);
        Cat cat5 = new Cat ("Пауло",6);

        Plate plate = new Plate(5);
        plate.registerCat(cat1);
        plate.registerCat(cat2);
        plate.registerCat(cat3);
        plate.registerCat(cat4);
        plate.registerCat(cat5);
        plate.notifyAllCats();
        plate.addFood(10);
        plate.addFood(6);
        plate.info();

    }
}
