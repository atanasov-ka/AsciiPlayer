package com.asciiplayer;

import java.io.File;
import java.nio.file.Path;

public class PlayerFactory {
	public static Player newPlayer(Path file) {
		return null;
	}
	
	public static Player newPlayer(File file) {
		return newPlayer(file.toPath());
	}
}