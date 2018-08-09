package exercises;

public class MovieApp {

	public static void main(String[] args) {
		Movie movie1 = new Movie("Casablanca",Rating.PARENTIALGUIDANCE);
		System.out.println(movie1);
		Movie movie2 = new Movie("Office Space",Rating.MATURE);
		System.out.println(movie2);
		Movie movie3 = new Movie();
		System.out.println(movie3);
	}
}
