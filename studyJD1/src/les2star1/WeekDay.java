package les2star1;

import java.util.GregorianCalendar;

public class WeekDay {
	private int d;
	private String mm;
	private int yy;
	private String[] monthes = {"март","апрель","май","июнь","июль","август","сент€брь","окт€брь","но€брь","декабрь","€нварь","февраль"};
	private String[] days = {"воскресенье","понедельник","вторник","среда","четверг","п€тница","суббота"};
	
	public WeekDay (int d, String mm, int yy){
		this.d = d;
		this.mm = mm;
		this.yy = yy;
	}
	
	public String dayOfWeek(int d, String mm, int yy){
		int yea = yy % 100;
		int cen = yy / 100;
		int mon = 1;
		GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
		boolean isLeapYear = cal.isLeapYear(yy);
		while (!monthes[mon-1].equals(mm)){
			mon ++;
		}
		
		int fml = (d + (13*mon-1)/5+yea+yea/4+cen/4-2*cen+777)%7;// formula
		if (mm.equals("€нварь") || mm.equals("февраль")){
			if (isLeapYear){
				if ((fml - 2)<0){
					fml = fml + 7;
				}
				String dow = days[fml-2];//day of week
				return dow;
			}
			else{
				if ((fml - 1)<0){
					fml = fml + 7;
				}
				String dow = days[fml-1];//day of week
				return dow;
			}
		}
		else{
			String dow = days[fml];//day of week
			return dow;
		}
	}
}
