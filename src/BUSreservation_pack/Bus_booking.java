package BUSreservation_pack;

import java.util.ArrayList;
import java.util.Scanner;

public class Bus_booking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Bus> buses = new ArrayList<Bus>();
		ArrayList <Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus (1, true, 2));
		buses.add(new Bus (2, false, 3));
		
		for(Bus b : buses ) {
			b.DispalyBus_info();
			
		}
		
		
		int user_Option = 1;
		Scanner scan = new Scanner(System.in);
		while(user_Option == 1) {
			System.out.println("Enter 1 to book and 2 to close");
			user_Option = scan.nextInt();	
			if(user_Option == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(buses, bookings)) {
					bookings.add(booking);
					System.out.println("Your booking is confrimed");
				}
				else {
					System.out.println("Buses is full");
				}
			
			}
		}
	}

}
