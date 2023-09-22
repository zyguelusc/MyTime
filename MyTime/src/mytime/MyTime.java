package mytime;

public class MyTime {
	private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;
    
	public MyTime() {
		this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.meridian = true;
	}
	public MyTime(int hours, int minutes, int seconds, boolean meridian) {
		this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridian = meridian;
	}
	//Getters
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
        return minutes;
    }
	public int getSeconds() {
	        return seconds;
	}
	public String getMeridian() {
        return (meridian) ? "AM": "PM";
    }
	
	
	//SETTERS
	public void setHours(int hours) {
	    this.hours = hours;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public void setSeconds(int seconds) {
	    this.seconds = seconds;
	}
	public void setMeridian(boolean meridian) {
	    this.meridian = meridian;
	}
	
	//Functions
	public void advanceTime(int seconds) {
	    int ctr;
	    for (ctr = 0; ctr < seconds; ctr++) {
	    this.tickBySecond();
	    }
	}
	public void tickBySecond() {
	    if (this.seconds == 59) {
	        this.tickByMinute();
	        this.setSeconds(-1);
	    }
	    this.setSeconds(this.seconds + 1);
	}
	public void tickByMinute() {
	    if (this.minutes == 59) {
	        this.tickByHour();
	        this.setMinutes(-1);
	    }
	    this.setMinutes(this.minutes + 1);
	}
    public void tickByHour() {
	    this.setHours(this.hours + 1);
	    if (this.hours == 12) {
	        this.setMeridian(!this.meridian);
        }
	}
	public void displayTime12() {        
	   System.out.printf("%02d:%02d:%02d %s\n", this.hours, this.minutes, this.seconds, this.getMeridian());
	}
	public void displayTime24() {
	   System.out.printf("%02d:%02d:%02d\n", (this.meridian) ? this.hours - 12: this.hours, this.minutes, this.seconds);
    }
	@Override
	public String toString() {
	   return String.format("%02d:%02d:%02d %s\n", this.hours, this.minutes, this.seconds, this.getMeridian());
	}

}
