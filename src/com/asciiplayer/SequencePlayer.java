package com.asciiplayer;


import java.io.File;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public abstract class SequencePlayer extends FilePlayer {
	public SequencePlayer(Path path) {
		super(path);
	}
	
	protected abstract List<String> convert (Path path);
	
	public void play() throws Exception {}
	{
		//int lastFrameLinesCount = 0;
		List<String> list = convert(getSource());
		for (String string : list) {
			System.out.println(string);
			
			/*
			for (int i = 0; i < string.length(); ++i)
			{
				if (string.charAt(i) == '\n')
					++lastFrameLinesCount;
			}
			*/
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				
			clearConsole();
		}
	}
	
	public final static void clearConsole()
	{
	    try {
	        final String os = System.getProperty("os.name");
	        if (os.contains("Windows")) {
	            Runtime.getRuntime().exec("cls");
	        }
	        else {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e) {
	    	e.printStackTrace();
	    }
	}
}
