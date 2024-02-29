public class Giocatore {

    private String name;
    private int score;

    public Giocatore (String name){
        this.name = name;
        this.score = 0;
    }
    public int getScore() {
        return score;
    }

    public void aggScore (int score){
        this.score = this.score + score;
    }

    public String getName() {
        return name;
    }
}
