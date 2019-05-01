package com.bac.novell.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImp<E>  extends ArrayList<E>{
	private static int size =0;
	private static List<String> add = new ArrayList<String>();
	private static final long serialVersionUID = -3297407938471706504L;

	@Override
	 public E get(int index) {

		 if (index < size)
		 {	
			 add.get(index);
		 }
		 else{
			 throw new ArrayIndexOutOfBoundsException("ArrayOutOfIndex at " + index +"Size:" +size);
		 }
		return null;
		 
	 }
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayListImp ac= new ArrayListImp();
	 System.out.println("ac :" + ac);
		add.add("Manoj");
		add.add("Manojkumar");
		add.add("Manoj1");
		add.add("Manoj2");
		
		String str  = "Manojkumar";
		String str1 = "Manojkumar";
		String str2 = new String("Manojkumar");
		  
		if (str == str1){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		String str3 = str2.intern();
		
		if (str.equals(str2)){
			System.out.println("true");
		}
		
		if (str == str3){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		
		System.out.println("str2 :" + str2);
		
		for (String index: add){
			 System.out.println(index);
		}
		
		
		boolean flag = true;
		
		Boolean booleanFlag = new Boolean(true);
		
		
		String str4 = flag && booleanFlag.booleanValue() ? "Manoj" : "kumar";
		
		System.out.println("str4");
		
		if (flag && booleanFlag.booleanValue()){
			System.out.println(true);
		}
		
		
		
	    size = add.size();
		ac.get(6);
		
/*
		for (int i = 0; i < add.size(); i++) {
			 
		}
*/	}

}
