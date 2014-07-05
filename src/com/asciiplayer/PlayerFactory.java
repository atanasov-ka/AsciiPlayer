package com.asciiplayer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PlayerFactory {
	public static Player newPlayer(Path file, int columns) throws IOException, UnknownResourceTypeException {
		String extension = Files.probeContentType(file);
	    extension = extension.toLowerCase();
	    FilePlayer p = null;
		switch (extension) {
		case "image/jpeg":
			p = new PicturePlayer(file);
			break; 
		case "image/gif":
			p = new GifPlayer(file);
			break;
		default:
			throw new UnknownResourceTypeException();
		}
		
		p.setColumns(columns);
		return p;
	}
	
	public static Player newPlayer(File file, int columns) throws IOException, UnknownResourceTypeException {
		return newPlayer(file.toPath(), columns);
	}
}