package p1;

public interface Car {

	public String carModel="";
	public String carColor="";
	public int cc=0;
	
	
	public void startOn();
	public int getCurSpeed();
	public void addSpeed();
	public void subSpeed();
	public void stop();
	public void excute();
	
	public void setCarColor(String color);
	public String getCarColor();
	
}
