package com.asciiplayer;


import java.io.File;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public abstract class SequencePlayer extends FilePlayer {
	public SequencePlayer(Path path) {
		super(path);
	}
	
	protected abstract List<String> convert (File file);
	
	// from file to list<BufferedImage>
	// foreach ()
	// 		FileUtils.write();
	// 		sleep(50);
	// 		clear();

	

}
