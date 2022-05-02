package com.generator;

public class PasswordGenTest {
	public static void main(String... strings) {

		PasswordGen passwordGen = new PasswordGen();
		System.out.println(passwordGen.genratePassword(6));
		System.out.println(passwordGen.genratePassword(6));
		
	}

}
