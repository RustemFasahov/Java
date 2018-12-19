public class Test{
    public static void main(String[]args){
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", 50);
        cats[1] = new Cat("Murzik", 75);
        cats[2] = new Cat("Tom", 100);
        Plate plate1 = new Plate(150);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
            cats[i].info();
        }
        plate1.fill(100);
        cats[2].eat(plate1);
        cats[2].info();
        plate1.info();
    }
}