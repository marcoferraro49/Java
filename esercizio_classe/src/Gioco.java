public class Gioco {

    private Giocatore [] giocatori;
    private Dado dado;

    public Gioco(Giocatore[] giocatori) {
        this.giocatori = giocatori;
        this.dado = new Dado();
    }

    public void avviaGioco(){
        for (int i = 0; i < 6; i++) {
            System.out.println("Lancio " + (i + 1) + ":");
            for (Giocatore giocatore: giocatori){
                int lancio = dado.lancia();
                giocatore.aggScore(lancio);
                System.out.println("il giocatore: " + giocatore.getName() + " ha ottenuto: " + lancio + " e il suo punteggio attuale è: "  + giocatore.getScore());
            }
        }
        Giocatore winner = giocatori[0];
        for (int i = 1; i < giocatori.length; i++){
            if(giocatori[i].getScore() > winner.getScore()){
                winner = giocatori[i];
            }
        }
        System.out.println("Il vincitore è: " + winner.getName() + " con il punteggio: " + winner.getScore());
    }
}
