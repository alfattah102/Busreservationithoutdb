package BUSreservation_pack;

public class Bus {
	private int BusNo;
	private boolean Ac;
	private int Capacity;
	
	
	public int getBusNo() {
		return BusNo;
	}


	public void setBusNo(int busNo) {
		BusNo = busNo;
	}
	
	public void DispalyBus_info() {
		
		System.out.println("BusNo: " + BusNo + ",  Ac:  " + Ac + ", Capacity:  " + Capacity);
	}


	public boolean isAc() {
		return Ac;
	}


	public void setAc(boolean ac) {
		Ac = ac;
	}


	public int getCapacity() {
		return Capacity;
	}


	public void setCapacity(int capacity) {
		Capacity = capacity;
	}


	public Bus(int busNo, boolean ac, int capacity) {
		
		BusNo = busNo;
		Ac = ac;
		Capacity = capacity;
	}
	
	
		

}
