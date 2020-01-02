package com.test.circle;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class DllTest {
	public interface Dll extends Library{	
		Dll instance = (Dll)Native.loadLibrary("CreateDLL", Dll.class);
		//Dll instance = (Dll)Native.load("CreateDLL", Dll.class);
		public int Add(int a,int b);
		public int substract(int a,int b);
		public String printHello();
		//public String HelloWorld();
	}

	public static void main(String[] args) {
		/*
		String loadDir = System.getProperty("java.library.path");
		System.out.println(loadDir);
		*/
		int sum = Dll.instance.Add(9, 9);
		int sub = Dll.instance.substract(5, 3);
		System.out.println("add(5,3) = "+sum);
		System.out.println("substract(5,3) = "+sub);
		String string = Dll.instance.printHello();
		System.out.println(string);
		/*
		String val = Dll.instance.HelloWorld();
		System.out.println(val);
		*/
	}

}
