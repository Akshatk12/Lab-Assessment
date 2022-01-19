package Q2;

import java.util.*;

public class Date {
	private int day;
	private int month;
	private int year;

	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	
	public Date(Date date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Day: ").append(day).append(" Month:" ).append(month).append(" Year ").append(year);
		return sb.toString();
	}


}