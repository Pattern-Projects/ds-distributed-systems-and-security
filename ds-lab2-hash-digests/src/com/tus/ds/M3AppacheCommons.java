package com.tus.ds;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Base64;

public class M3AppacheCommons {
	public static void main(String[] args) {
	
		try {		
			MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
			InputStream is = new FileInputStream("data/test.txt");
			byte[] buffer = new byte[64];

			int bytesRead = 0;
			while ((bytesRead = is.read(buffer)) > 0) {
				algorithm.update(buffer, 0 , bytesRead);
				System.out.println(bytesRead);
				System.out.println(new String(buffer));
			}
			is.close();
			
			byte[] digest = algorithm.digest();
			
			String encodedDigest = Base64.getEncoder().encodeToString(digest);
			System.out.println("Base 64 encodeded message difest: "+ encodedDigest);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
