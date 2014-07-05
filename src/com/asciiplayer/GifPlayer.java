package com.asciiplayer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GifPlayer extends SequencePlayer {
	GifPlayer(Path source) {
		super(source);
	}
	
	GifPlayer(File source) {
		super(source.toPath());
	}

	@Override
	public List<String> convert(Path path) {
		GifDecoder decoder = new GifDecoder();
		List<String> frames = new ArrayList<String>();
		decoder.read(path.toString());
		BufferedImage frame;
		for (int i = 0, len = decoder.getFrameCount(); i < len; i++) {
			frame = decoder.getFrame(i);
			frames.add(PlayerUtils.stringify(frame, getColumns()));
		}
		
		return frames;
	}
}
