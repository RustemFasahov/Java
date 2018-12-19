public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p){
        appetite = p.decreaseFood(appetite);
        if(appetite == 0){
            satiety = true;
        }
    }
    public void info(){
        System.out.printf("Кот %s: апетит %d, сытость %b \n",name, appetite, satiety);
    }
}
