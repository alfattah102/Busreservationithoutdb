package BUSreservation_pack;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	String cus_Name;
	Date date;
	int bus_No;
	public Booking() {
		System.out.println("Please enter the details of bookings");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter passanger name :");
		cus_Name = scan.next();
		System.out.println(" Please enter the Date of travel dd-mm-yy");
		String Inputdate = scan.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-YYYY");
		try {
			date = dateformat.parse(Inputdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("please enter the Bus No");
		bus_No = scan.nextInt();
		
	}
	public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings) {
		// TODO Auto-generated method stub
		int Capacity = 0;
		for(Bus b : buses) {
			if(b.getBusNo() == bus_No) {
				Capacity =b.getCapacity();
			}
		}
		int booked = 0;	
		for(Booking bk : bookings) {
			if(bk.bus_No == bus_No && bk.date.equals(date)) {
				booked++;
			}
			
		}
		return booked<Capacity?true:false;
			
		}
	}
	


