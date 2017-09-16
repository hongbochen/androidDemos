package com.bobo.utils;

public class NativeClass {

	static {
		System.loadLibrary("algo");
		System.loadLibrary("test");
	}

	public static native int add();
	public static native int sub();
	public static native int mul();
	public static native int div();
}
