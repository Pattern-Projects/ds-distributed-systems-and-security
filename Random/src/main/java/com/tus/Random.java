package com.tus;

import java.math.BigInteger;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.random());
		System.out.println(Math.random());
		java.util.Random random = new java.util.Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		System.out.println(random.nextDouble());
		System.out.println(random.nextDouble());
		System.out.println(random.nextDouble());

		System.out.println(random.nextBoolean());
		
		
		 java.security.SecureRandom sr = new  java.security.SecureRandom();
		 System.out.println(sr.nextInt(1000));
		 System.out.println(sr.nextInt(1000));
		 System.out.println(sr.nextInt(1000));
		 System.out.println(sr.getAlgorithm());
		 
		 sr.setSeed(1000);
		 System.out.println(sr.nextInt(1000));
		 System.out.println(sr.nextInt(1000));
		 System.out.println(sr.nextInt(1000));
		 
		int seed = 5;
		LinearCongruentialGenerator lcg = new LinearCongruentialGenerator(5);
		
		for (int i = 0; i < 20 ; i++ ) {
			System.out.println(lcg.next(i*3));
		}
		 
		
		 System.out.println(sr.getProvider().getName());
		
		 
		 
		 
	}
	

}
