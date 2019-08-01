package com.exam;

import java.util.StringTokenizer;

public class Ex5 {

	public static void main(String[] args) {
		String str = "Java";
		str += "Programming";

		// TODO Auto-generated method stub
		// StringBuffer: 가변크기의 버퍼를 가짐.
		// 객체 자신의 문자열 값 수정 가능.
		StringBuffer sb = new StringBuffer();
		sb.append("Java");// 뒷부분에 추가
		System.out.println(sb.toString());
		sb.append("Programming");
		System.out.println(sb);

		sb.replace(0, 4, "JSP");

		sb.insert(3, ",");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		System.out.println("===================");

		// StringTokenizer:문자열을 분리하기 위해 사용.
		// String class split() same function with method.

		String strFruits = "사과#배#감#포도";

		StringTokenizer st = new StringTokenizer(strFruits, "#");
		// token
		// Delimeter

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st.countTokens());

		String query = "name=John&&addr=NY&&age=26";

		//&, = 모두 구분문자가 됨. 
		StringTokenizer st2 = new StringTokenizer(query, "&=");
		System.out.println(st2.countTokens());
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}

	}// main

}
