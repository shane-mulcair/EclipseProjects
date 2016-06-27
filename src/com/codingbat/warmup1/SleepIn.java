package com.codingbat.warmup1;

public class SleepIn {

	public boolean sleepIn(boolean weekday, boolean vacation){
		if (vacation ||!weekday){
			return true;
		}
		else{
			return false;
			}
	}
}
