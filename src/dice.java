
public class dice {

	private static int randomnumber;

	public static int OneThrow(int dices, int bounces){
	
	
			randomnumber = (dices+(1+(int )(Math.random()*6)))+bounces;
			return randomnumber;			
}
	public static int OneThrow(){
		randomnumber = 1+(int )(Math.random()*6);
		return randomnumber;
	}
}