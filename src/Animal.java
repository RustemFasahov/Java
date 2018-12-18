public class Animal {

    protected int runDistance;
    protected int swimingDistance;
    protected float jumpHeight;

    public boolean run(int distance){
        if (distance <= runDistance){
            return true;
        }
        return false;
    }
    public boolean swiming(int distance){
        if (distance <= swimingDistance){
            return true;
        }
        return false;
    }
    public boolean jump(float height){
        if (height <= jumpHeight){
            return true;
        }
        return false;
    }
}
