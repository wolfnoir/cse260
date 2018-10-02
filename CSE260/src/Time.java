//everett yang, SBU ID 111756324
import java.util.Calendar;

public class Time {
	private long hour, minute, second;
	
	public Time(){
		  Calendar cal = Calendar.getInstance();
		  hour = cal.get(Calendar.HOUR_OF_DAY);
		  minute = cal.get(Calendar.MINUTE);
		  second = cal.get(Calendar.SECOND);
		}
	
	public Time(long elapseTime) {
		long totalSeconds = elapseTime/1000;
		second = totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		minute = totalMinutes%60;
		long totalHours = totalMinutes/60;
		hour = totalHours%24;
	}
	
	public Time(long newHour, long newMinute, long newSecond) {
		hour = newHour;
		minute = newMinute;
		second = newSecond;
	}
	
	public long getHour() {
		return hour;
	}
	
	public long getMinute() {
		return minute;
	}
	
	public long getSecond() {
		return second;
	}
	
	public void setTime(long elapseTime) {
		long totalSeconds = elapseTime/1000;
		second = totalSeconds%60;
		long totalMinutes = totalSeconds/60;
		minute = totalMinutes%60;
		long totalHours = totalMinutes/60;
		hour = totalHours%24;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
		System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
	}

}
