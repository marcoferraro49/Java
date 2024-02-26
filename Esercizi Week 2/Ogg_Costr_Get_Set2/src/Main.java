public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("1.6", "AB123AC", "Tesla", "Model 3");

        System.out.println("La cilindrata è: " + auto1.getCilindrata());
        System.out.println("La targa è: " + auto1.getTarga());
        System.out.println("La marca è: " + auto1.getMarca());
        System.out.println("Il modello è: " + auto1.getModello());
    }
}