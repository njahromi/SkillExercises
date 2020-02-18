
public class PollingPlatform {

	public static void main(String[] args) {

		int trumpVotes = 2;
		int bernieVotes = 2;
		int garyVotes = 14;
		int ralphVotes = 1;

		if (trumpVotes > bernieVotes && trumpVotes > garyVotes && trumpVotes > ralphVotes) {
			
			System.out.println("Donald Trump has won the election!");

		}
		
		else if (bernieVotes > trumpVotes && bernieVotes > garyVotes && bernieVotes > ralphVotes ){
			
			System.out.println("Bernie Sanders has won the election!");
		}
		
		else if (garyVotes > trumpVotes && garyVotes > bernieVotes && garyVotes > ralphVotes ) {
			
			System.out.println("Gary Johnson has won the election!");
		}
		
		else {
			
			System.out.println("Ralph Nader has won the election!");
		}

	}
}
