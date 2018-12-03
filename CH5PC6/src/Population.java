/**
 *
 * @author 992006036
 */
public class Population {
    private int pop;
    private double percent;
    private int days;
    private double increase;
    public Population(int p, double per, int d){
        pop = p;
        percent = per;
        days = d;
    }
    public void dailyPop(){
        double num;
        num = 0.0;
        if(pop >= 2 && percent >= 0.0 && days >= 1){
            num = percent * pop;
            for(int x = 0; x < days; x++){
                pop += num;
            }
        }else{
            System.out.println("Please input correct data.");
        }
        
        
    }
    public int getPop(){
        return pop;
    }
}
