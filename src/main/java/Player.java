public class Player {
    public String name;
    public int age;
    public boolean isMale;
    public String position;
    public int score;
    public int rate;

    public void shoot(){
        if(Math.random()*101<this.rate){
            System.out.println("中球");
            this.score+=2;
        }
    }
}
