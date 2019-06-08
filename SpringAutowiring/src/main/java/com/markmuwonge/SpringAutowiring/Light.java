package com.markmuwonge.SpringAutowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Light {
	
	@Autowired
	private Power power;
	
	
	public void flipSwitch()
	{
		if (power != null)
		{
			power.switchOn();
		}
		else
		{
			System.out.print("Light has no power");
		}
	}

}
