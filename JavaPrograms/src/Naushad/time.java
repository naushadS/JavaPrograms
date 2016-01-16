package Naushad;

public class time {
	private static int hour,minute,second;

	public static void main(String[] args) {
		System.out.println(toMilitary());
		System.out.println(toRegular());
		setTime(16,2,6);
		System.out.println(toMilitary());
		System.out.println(toRegular());
	}

	private static void setTime(int h,int m,int s){
		hour = ((h>=0 && h<24)?h:0);
		minute=((m>=0 && m<60)?m:0);
		second=((s>=0 && s<60)?s:0);
		System.out.println("Time set successfully");
	}

	private static String toMilitary() {
		System.out.println("Military Time:");
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}

	private static String toRegular() {
		System.out.println("Regular Time:");
		return String .format("%d:%02d:%02d %s", ((hour==0||hour==12)?12:hour%12),minute, second,(hour<12)?"AM":"PM");
	}

}
