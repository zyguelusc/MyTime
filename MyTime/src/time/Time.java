package time;
import mytime.MyTime;
public class Time {

	public Time() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime time = new MyTime(5, 00, 35, false);
	    time.displayTime12();
	    time.displayTime24();
	    time.advanceTime(360); 
	    time.displayTime12();
	    time.displayTime24();
	    System.out.println(time);
	}

}
