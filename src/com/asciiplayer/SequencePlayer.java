package com.asciiplayer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import jline.ConsoleReader;

public abstract class SequencePlayer extends FilePlayer {
	public SequencePlayer(Path source) {
		super(source);
	}

	public SequencePlayer(File source) {
		this(source.toPath());
	}

	protected abstract List<String> convert(Path path);

	public void play() throws Exception {
		List<String> list = convert(getSource());
		//ConsoleReader c = new ConsoleReader();
		
		for (String string : list) {
			//c.printString(string);
			System.out.println(string);
			
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			
			//c.clearScreen();
			System.out.print("\u001b[2J");
			System.out.flush();
		}
	}

	public final static void clearConsole() throws IOException {
		
	}
}
