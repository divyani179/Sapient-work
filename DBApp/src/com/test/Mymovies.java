package com.test;

import java.util.ArrayList;

public class Mymovies {
 ArrayList<String> getAllMovies(String lang){
	 ArrayList<String> al=new ArrayList<String>();
	 if(lang.equalsIgnoreCase("english"))
	 {
		 al.add("EM1");
		 al.add("EM2");
		 al.add("EM3");
		 
	 }else if(lang.equalsIgnoreCase("tamil")){
         
		 al.add("TM1");
		 al.add("TM1");
		 al.add("TM3");
		 
	 }else
	 {
		 al.add("HINDI1");
		 al.add("HINDI2");
		 al.add("HINDI3");
		 
	 }
	return al;
 }
 
 
 
}
