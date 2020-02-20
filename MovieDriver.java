import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
	Scanner Sc = new Scanner (System.in);
	Movie movieObject= new Movie();
	
	 // Variables
    String title;
    String rating;
    int soldTickets;
 
    char ch='y';

	
  
    while(ch=='y')
    
     {
	  System.out.println("enter the title of the movie: ");
	  String title1 = Sc.nextLine();
      movieObject.setTitle(title1);
      
      // enter the rating of the movie
      System.out.print("enter the rating of the movie: ");
     
	String rating1 = Sc.nextLine();
      movieObject.setRating(rating1);
      
      //enter number of tickects sold
      
      System.out.print("Enter the number of tickets this movie sold: ");
      int soldTickets1 =Sc.nextInt();
      movieObject.setSoldTickets(soldTickets1);
      System.out.println();
      
      //print the information the user entered
      
      System.out.print(movieObject.toString());
      System.out.println();
      
      //ask user if he want to add another movie
      System.out.print("Would You Like to enter another Movie(y/n)? ");
      ch=Sc.next().charAt(0);
      Sc.nextLine();
  }
	
 
  
  System.out.println("Goodbye!");

 

 

     }

  
  
 
}

