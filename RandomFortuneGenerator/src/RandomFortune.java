
public class RandomFortune {

	public static void main(String[] args) {

		int min = 1;
		int max = 5;
		int x = (int) ((Math.random() * ((max - min) + 1)) + min);

		switch (x) {

		case 1:

			System.out.println("The fortune you seek is in another cookie.");
			break;
			
		case 2:
			
			System.out.println("A conclusion is simply the place where you got tired of thinking.");
			break;
			
		case 3:
			
			System.out.println("A cynic is only a frustrated optimist.");
			break;
			
		case 4:
			
			System.out.println("A foolish man listens to his heart. A wise man listens to cookies.");
			break;
			
		case 5:
			
			System.out.println("A fanatic is one who can't change his mind, and won't change the subject.");
			break;

		}
	}

}
