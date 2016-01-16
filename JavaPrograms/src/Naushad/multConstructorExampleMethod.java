package Naushad;

public class multConstructorExampleMethod {
	private int hour,minute,second;

	//constructor with 0 arguments
	public multConstructorExampleMethod(){
		this(0,0,0); //calls the constructor again with specified parameters
		//(so gets redirected to constructor which takes in 3 parameters)
	}

	//constructor with 1 arguments
	public multConstructorExampleMethod(int h){
		this(h,0,0); //calls the constructor again with specified parameters
		//(so gets redirected to constructor which takes in 3 parameters)
	}

	//constructor with 2 arguments
	public multConstructorExampleMethod(int h,int m){
		this(h,m,0); //calls the constructor again with specified parameters
		//(so gets redirected to constructor which takes in 3 parameters)
	}

	//constructor with 3 arguments
	public multConstructorExampleMethod(int h,int m,int s){
		setTime(h,m,s);
	}

	private void setTime(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}

	private void setHour(int h) {
		hour=((h>=0&&h<24)?h:0);
	}

	private void setMinute(int m) {
		minute=((m>=0&&m<60)?m:0);
	}

	private void setSecond(int s) {
		second=((s>=0&&s<60)?s:0);
	}

	private int getHour() {
		return hour;
	}

	private int getMinute() {
		return minute;
	}

	private int getSecond() {
		return second;
	}

	public String toMilitary(){
		return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
	}
}
