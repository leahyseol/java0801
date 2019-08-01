package com.exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// math class
		double d = 3.14;

		System.out.println(Math.ceil(3.56));
		System.out.println(Math.floor(3.56));

		System.out.println(Math.ceil(3.16));
		System.out.println(Math.floor(3.56));

		System.out.println(Math.ceil(-3.16)); // 소수점 첫째자리 올림
		System.out.println(Math.floor(-3.56));

		System.out.println(Math.sqrt(9));
		System.out.println(Math.pow(2, 3));

		// Random class
		Random random = new Random();
		System.out.println("0이상100미만의 난수: " + random.nextInt(100));

		System.out.println(random.nextFloat());
		System.out.println(random.nextBoolean());

		// Calendar 클래스 : 현재날짜와 시간정보를 가짐.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));

		System.out.println(cal.get(Calendar.MONTH));
		System.out.println((Calendar.DATE) + "일");

		System.out.println((Calendar.AM_PM));
		System.out.println((Calendar.AM));
		System.out.println((Calendar.PM));

		System.out.println((Calendar.HOUR_OF_DAY) + "분");
		System.out.println((Calendar.SECOND) + "초");

		// 1초=1000밀리초,
		System.out.println((Calendar.MILLISECOND + "밀리초"));

		System.out.println(cal.get(Calendar.DAY_OF_WEEK));

		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch (day) {
		case 1:
			System.out.println("일");
			break;
		case 2:
			System.out.println("월");
			break;
		case 3:
			System.out.println("화");
			break;
		case 4:
			System.out.println("수");
			break;
		case 5:
			System.out.println("목");
			break;
		case 6:
			System.out.println("금");
			break;
		case 7:
			System.out.println("토");
			break;

			cal.clear();
			cal.set(2016, 11, 25);

			cal.set(Calendar.HOUR_OF_DAY, 20);
			cal.set(Calendar.HOUR, 30);

			System.out.println(cal.toString());
			
			Date date = new Date();
			System.out.println(date);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss(E)");
			String str=sdf.format(date);
		

	}

}
