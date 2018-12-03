/**
 * Richard Fitzgerald
 * CH5PC6 - Population
 * Programming III - AP
 * 11/28/18
 */
public class PopulationRunner {

   
    public static void main(String[] args) {
        Population mice = new Population(2, .28, 2);
        mice.dailyPop();
        System.out.println(mice.getPop());
    }

}
