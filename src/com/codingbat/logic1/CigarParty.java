package com.codingbat.logic1;

public class CigarParty {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if ((isWeekend && cigars >= 40) || (!isWeekend && cigars >= 40 && cigars <= 60)) {
			return true;
		}
		return false;
	}
}
