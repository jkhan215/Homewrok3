package Raffle;

public class PrizeNumbers {
	int [] winingNumbers = new int [7];{
		for(int i=0; i < winingNumbers.length; i++){
			winingNumbers[i] = (int) (Math.random()*50);
			}
		for( int i = 0; i < winingNumbers.length; i++){
			System.out.println(winingNumbers[i]);
			
		}

	}
}
