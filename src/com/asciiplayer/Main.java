package com.asciiplayer;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
	public static void main(String[] args) {
		if (args.length == 0)
			return;
		
		Player player;
		try {
			player = PlayerFactory.newPlayer(Paths.get(args[0]));
			player.play();
		} catch (IOException | UnknownResourceTypeException e) {
			e.printStackTrace();
		}
		
	}
}
