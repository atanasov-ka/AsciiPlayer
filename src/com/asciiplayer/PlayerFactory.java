package com.asciiplayer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PlayerFactory {
	public static Player newPlayer(Path file) throws IOException, UnknownResourceTypeException {
		String extension = Files.probeContentType(file);
	    extension = extension.toLowerCase();
		switch (extension) {
		case "jpeg":
		case "jpg":
		case "png":
			return new PicturePlayer(file);
		case "gif":
			return new GifPlayer(file);
		default:
			throw new UnknownResourceTypeException();
		}
	}
	
	public static Player newPlayer(File file) throws IOException, UnknownResourceTypeException {
		return newPlayer(file.toPath());
	}
}