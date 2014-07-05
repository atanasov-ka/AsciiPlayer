package com.asciiplayer;

import java.io.File;
import java.nio.file.Path;

public abstract class FilePlayer implements Player {
	protected Path source;
	private int columns = 100;
	
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
	
	protected int getColumns()
	{
		return columns;
	}
	
	public void setColumns(int columns)
	{
		this.columns  = columns;
	}
}
