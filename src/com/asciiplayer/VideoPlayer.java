package com.asciiplayer;

import java.nio.file.Path;
import java.util.List;

public class VideoPlayer extends SequencePlayer {

	public VideoPlayer(Path path) {
		super(path);
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected List<String> convert(Path path) {
		// TODO Auto-generated method stub
		return null;
	}

}
