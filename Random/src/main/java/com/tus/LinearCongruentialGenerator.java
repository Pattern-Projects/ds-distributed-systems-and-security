package com.tus;

public class LinearCongruentialGenerator {
	 int mod = 7;
	 int multiplier = 3;
	 int prev;
	int value;
	int seed;
	 
	LinearCongruentialGenerator(int seed) {
		this.prev = seed;
	}
	
	int next(int inc) {
		value = (multiplier*prev + inc)%mod;
		prev = value;
		return value;
		
	}
}
