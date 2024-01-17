package com.anudip;

public class IntegerPrinter extends Thread {
	
	public void run()
	{
		for(int i=1;i<26;i++)
		{
			System.out.println(i);
			//Sendingb the thread to sleep for 2 seconds, during
			//which other threads wll be given chance to run
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException in) {}
		}
	}


}
