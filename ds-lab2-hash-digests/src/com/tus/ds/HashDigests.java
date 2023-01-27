package com.tus.ds;

import java.util.Base64;

public class HashDigests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "querty";
		String encodedString = encode(s);
		System.out.println("s is: " + s);
		System.out.println("Encoded: " + encodedString);
		String decodedString = decode(encodedString);
		System.out.println("Decoded: " + decodedString);
	}

	public static String encode(String s) {
		byte[] sbytes = s.getBytes();
		return Base64.getEncoder().encodeToString(sbytes);		
	}
	
	
	public static String decode(String s) {
		
		byte[] decodedBytes = Base64.getDecoder().decode(s);
		return new String(decodedBytes);
		
		
	}

}
