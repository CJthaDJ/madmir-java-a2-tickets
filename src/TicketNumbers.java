import java.util.Scanner;

public class TicketNumbers {

	public static void main(String[] args) {
		int ticketNumbers, stem, checkDigit;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a six digit number:");
		ticketNumbers=sc.nextInt();
		stem = ticketNumbers /10;
		checkDigit = ticketNumbers % 10;
		
		while (checkDigit == stem % 7) {
			System.out.println("That is not a valid ticket number, what the hell you doing?");
			System.out.println("Try Again");
			ticketNumbers = sc.nextInt();
		    stem = ticketNumbers / 10;
		    checkDigit = ticketNumbers % 10;
	
		System.out.println("That is a valid ticket number, well done");    
		}
		}			

	}

