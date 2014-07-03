package com.asciiplayer;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

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
		for (String string : list) {
			System.out.println(string);

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			clearConsole();
		}
	}

	public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}
}
