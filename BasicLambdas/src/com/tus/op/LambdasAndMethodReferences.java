package com.tus.op;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdasAndMethodReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		constructorMR();
		unboundMR();
//		boundMR();
//		staticMR();
	}
	public static void constructorMR(){

        Supplier<List<String>> lambda = () -> new ArrayList();
        List<String> list = lambda.get();
        list.add("Lambda");
        System.out.println(list);  

        Supplier<List<String>> methodRef = ArrayList::new;
        list = methodRef.get();
        list.add("Method Reference");
        System.out.println(list);   

        Function<Integer, List<String>> lambda2 = n -> new ArrayList(n);
        list = lambda2.apply(20);
        list.add("Lambda");
        System.out.println(list);   

        Function<Integer, List<String>> methodRef2 = ArrayList::new;
        list = methodRef2.apply(20);
        list.add("Method Reference");
        System.out.println(list); 
    }
	
	public static void unboundMR(){

        Predicate<String> lambda = str -> str.isEmpty();
        System.out.println(lambda.test(""));
        System.out.println(lambda.test("xyz"));


        Predicate<String> methodRef = String::isEmpty;
        System.out.println(methodRef.test("")); 
        System.out.println(methodRef.test("xyz"));
        
        BiPredicate<String, String> lambda2 = (str, prefix) -> str.startsWith(prefix);
        System.out.println(lambda2.test("Mr. Joe Bloggs", "Mr."));
        System.out.println(lambda2.test("Mr. Joe Bloggs", "Ms."));


        BiPredicate<String, String> methodRef2 = String::startsWith;


        System.out.println(methodRef2.test("Mr. Joe Bloggs", "Mr."));
        System.out.println(methodRef2.test("Mr. Joe Bloggs", "Ms."));
    }
	
	public static void boundMR(){ 
        
        String name = "Mr. Joe Bloggs";
        
       
        Predicate<String> lambda = prefix -> name.startsWith(prefix); // 'name' is a local variable in the method
        System.out.println(lambda.test("Mr."));
        System.out.println(lambda.test("Ms."));

        
        Predicate<String> methodRef = name::startsWith;
        System.out.println(methodRef.test("Mr."));
        System.out.println(methodRef.test("Ms."));
    }
	
    public static void staticMR(){
        List<Integer> list = Arrays.asList(1,2,7,4,5);
        
       
        Consumer<List<Integer>> lambda = l -> Collections.sort(l); 
        System.out.println(list); 
        lambda.accept(list);
        System.out.println(list); 
        
        list = Arrays.asList(1,2,7,4,5);
        
        Consumer<List<Integer>> methodRef = Collections::sort;
        System.out.println(list); 
        methodRef.accept(list);
        System.out.println(list); 
    }

}
