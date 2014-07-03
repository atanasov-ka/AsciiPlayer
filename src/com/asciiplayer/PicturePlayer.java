package com.asciiplayer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import javax.imageio.ImageIO;

public class PicturePlayer extends FilePlayer {
	public PicturePlayer(Path source) {
		super(source);
	}
	
	public PicturePlayer(File source) {
		super(source.toPath());
	}

	@Override
	public void play() throws IOException {
		BufferedImage image = ImageIO.read(getSource().toFile());
		System.out.println(PlayerUtils.stringify(image, 100));
	}
}
