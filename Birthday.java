import java.util.Random;

public class Birthday {

	public static Random rand = new Random();
	
	private static final int REG_DAYS = 365;
	private static final int LEAP_DAYS = 366;
	
	private static int count = 0;
	
	public static int getBirthday() {
		if(count % 4 ==3) {
			return rand.nextInt(LEAP_DAYS);
		}else {
			return rand.nextInt(REG_DAYS);
		}
	}
}
