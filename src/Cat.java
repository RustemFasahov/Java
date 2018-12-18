public class Cat extends Animal {
    public Cat(){
        super.runDistance = (int)(Math.random()*200) + 100;
        super.swimingDistance = 0;
        super.jumpHeight = (float) (Math.random()*1.5) + 1.0f;
    }
}
