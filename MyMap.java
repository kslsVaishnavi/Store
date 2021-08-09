package com.pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
	 Map<String,String> mp=new HashMap<>();
	 mp.put("Username","vaishu");
	 mp.put("password","2713");
	 mp.put("role","admin");
	 
	 
	 //System.out.println(mp.size());
	 System.out.println(mp.get("Username"));
	 System.out.println(mp.get("password"));
	 System.out.println(mp.get("role"));
	 
	 Iterator itr = mp.keySet().iterator();
	 while(itr.hasNext()){
		 String key =(String)itr.next();
		 System.out.println(key+"-----"+mp.get(key));
	 }
	}

}
