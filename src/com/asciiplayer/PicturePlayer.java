package com.asciiplayer;

import java.awt.image.BufferedImage;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Path;

import javax.imageio.ImageIO;


public class PicturePlayer extends FilePlayer {
	
	public PicturePlayer(Path path)
	{
		super(path);
	}

	@Override
	public void play() throws IOException {
		BufferedImage image = ImageIO.read(getPath().toFile());
		System.out.println(PlayerUtils.stringify(image, 100));
	}
}
