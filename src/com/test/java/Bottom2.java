/**
 * 
 */
package com.test.java;

/**
 * @author snatara
 * 
 */
class Top {
	public Top(){}
	public Top(String s) {
		System.out.print("B");
	}
}

public class Bottom2 extends Top {
	public Bottom2(){
		
	}
	public Bottom2(String s) {
		System.out.print("D");
	}

	public static void main(String[] args) {
		new Bottom2("C");
		System.out.println(" ");
	}
}