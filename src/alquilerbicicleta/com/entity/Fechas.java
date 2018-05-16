package alquilerbicicleta.com.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fechas {
	Calendar fecha = new GregorianCalendar();
	int dia = fecha.get(Calendar.DAY_OF_MONTH);
	Calendar cal = Calendar.getInstance(); 

	int millisecond = cal.get(Calendar.MILLISECOND);
	int second = cal.get(Calendar.SECOND);
	int minute = cal.get(Calendar.MINUTE);
	      //12 hour format
	int hour = cal.get(Calendar.HOUR);
	      //24 hour format
	int hourofday = cal.get(Calendar.HOUR_OF_DAY);
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getHourofday() {
		return hourofday;
	}
	public void setHourofday(int hourofday) {
		this.hourofday = hourofday;
	}
	
	
}
