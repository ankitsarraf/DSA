package cvent;

import java.util.Arrays;

public class Reflection {
	private String a;
	private Reflection() {
		a = "a from default construtor";
		System.err.println("default constructor");
	}
	private Reflection(int a) {
		this.a = "a from parameterised constructor";
		System.err.println("parameterised constructor with parameter => "+a);
	}
	private void myMethod(int a, int b) {
		System.err.println("inside mymethod with parameter => ("+a+", "+b+")");
	}
	private void myMethod(int a, String b) {
		System.err.println("inside mymethod with parameter string => ("+a+", "+b+")");
	}
	public void show() {
		System.out.println("show public method");
		// TODO Auto-generated method stub

	}
	public void show(int...c) {
		System.out.println("show public method"
				
				+Arrays.asList(Arrays.asList(c).get(0)));
		Arrays.asList(c).stream().forEach(as->System.out.println(as));
		// TODO Auto-generated method stub

	}
	

}
