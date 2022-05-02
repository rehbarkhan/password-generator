package com.generator;

/***
 * 
 *
 * This class is used to generate the strong password.
 * Password generated using this call can contain characters like
 * alphabets , numbers and special character and the minimum password
 * size or length is 6
 * 
 * 
 * @implNote Random class form java.util libraries is used to generate
 * the random column number and row number which is being used to fetch a character from the 
 * password_combination array to string variable and then appending it to the String builder.
 * 
 */
public class PasswordGen {
	private StringBuilder password = new StringBuilder();
	private String[] password_combination;
	
	PasswordGen(){
		//creating the list of character sets.
		password_combination= new String[]{
				"abcdefghijklmnopqrstuvwxyz",
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
				"1234567890",
				"!@#$%^&*()_?{}[]"
			};
		
	}
	
	/***
	 * 
	 * @param password_length should be of type integer and the minimum value can be 6 only
	 * generatePassword method can generate the password which contains alphanumeric characters along with the numbers
	 * @return It will return the generated password in the form of string.
	 */
	public String genratePassword(int password_length) {
		password.setLength(0);
		if(password_length < 5) {
			return "Password length should be more than 5 character";
		}else {
			
			int row = 0;
			int cIndex = 0;
			for(int i=0;i<password_length;i++) {
			
				row = (int) (Math.random() * (password_combination.length));
				cIndex = (int)(Math.random() * (password_combination[row].length()));
				password.append(password_combination[row].charAt(cIndex));
				
			}		
			return password.toString();
		}
		
	}

}
