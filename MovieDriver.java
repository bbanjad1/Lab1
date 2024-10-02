package CMSC203.lab1;

import java.util.Scanner;
public class MovieDriver {
	public static void main(String[] args) {

Scanner input = new Scanner(System.in);
// creating movie object
Movie movie = new Movie();

//Movie title
char yOrN ='y';
while(yOrN=='y') {
System.out.println("Enter the movie title:");
String title = input.nextLine();
movie.setTitle(title);
// movie rating
System.out.println("Enter the movie rating: ");
String rating = input.nextLine();
movie.setRating(rating);

// number of ticket sold
System.out.println("Enter the number of ticketssold for this movie");
String Sold = input.nextLine();
System.out.println("Do you want to enter another?");
yOrN = input.next().charAt(0);
input.nextLine();
}
System.out.println("Goodbye");
	}
}
