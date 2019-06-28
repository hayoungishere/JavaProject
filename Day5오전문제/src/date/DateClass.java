package date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/mm/dd HH:mm:ss.SSS");
		System.out.println(sdf.format(date));
	}
}
