package com.asciiplayer;

import java.awt.image.BufferedImage;
import java.nio.file.Path;

import javax.imageio.ImageIO;

public class GifPlayer extends SequencePlayer {
	GifPlayer(Path path)
	{
		super(path);
	}

	@Override
	public void play() {
		//BufferedImage gif = ImageIO.read(get)		
	}
	
}
