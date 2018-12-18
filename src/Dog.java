public class Dog extends Animal {
    public Dog(){
        super.runDistance = (int)(Math.random()*400) + 200;
        super.swimingDistance = (int)(Math.random()*10) + 5;
        super.jumpHeight = (float) (Math.random() + 0.5f);
    }
}
