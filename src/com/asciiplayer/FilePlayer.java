package com.asciiplayer;

import java.io.File;
import java.nio.file.Path;

public abstract class FilePlayer implements Player {
	protected Path source;
	
	public FilePlayer(Path source) {
		setSource(source);
	}
	
	public FilePlayer(File source) {
		this(source.toPath());
	}
	
	protected Path getSource() {
		return source;
	}

	protected void setSource(Path source) {
		this.source = source;
	}
}
