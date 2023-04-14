import java.util.ArrayList;
import java.util.Random;

public class Hatcheck {
	
	private static Random generator = new Random();
	
    private ArrayList<Hat> hats=new ArrayList<Hat>();

	
	public boolean check(Hat hat) {
		//returning false if the hats already exists
        if (hats.contains(hat)) {
            return false;
        }
        //else adding the hat to the list
        return hats.add(hat);
    
	}
	
	public Hat retrieveHat() {
		return hats.remove(generator.nextInt(hats.size()));
    
	}
	

}
