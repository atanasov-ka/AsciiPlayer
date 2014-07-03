package com.asciiplayer;

import java.nio.file.Path;

public abstract class FilePlayer implements Player {
	protected Path path;
	public FilePlayer(Path path) {
		setPath(path);
	}
	protected Path getPath() {
		return path;
	}

	protected void setPath(Path path) {
		this.path = path;
	}
	
}
