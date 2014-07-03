package com.asciiplayer;
import java.nio.file.Path;

import javax.imageio.ImageIO;

public class GifPlayer extends SequencePlayer {
	GifPlayer(Path path)
	{
		super(path);
	}

	@Override
	public void play() {
		BufferedImage gif = ImageIO.read(getSource());
		
	}
	
}
