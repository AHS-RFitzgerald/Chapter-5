/**
 *
 * @author 992006036
 */
public class SquareDisplay {
    private String display = "";
    private int input;
    
    public SquareDisplay(int in){
        input = in;
    }
    
    public void Display(){
        if(input <= 15){
            int count = 0;
            for(int x = 0; x < input; x++){
                count = 0;
                while(count < input){
                    display += "X";
                    count ++;
                }
                display += "\n";
            }
        }else{
            System.out.println("Please enter a number no greater than 15.");
        }
    }
    public String getDisplay(){
        return display;
    }

}