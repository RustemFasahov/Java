public class Plate {
    private int food;
    public Plate(int food){
        this.food = food;
    }
    public int decreaseFood(int food){
        if(this.food - food >= 0){
            this.food -= food;
            return 0;
        }
        else {
            return food - this.food;
        }
    }
    public void fill(int volume){
        food += volume;
    }
    public void info(){
        System.out.println("В тарелке " + food + " еды.");
    }
}
