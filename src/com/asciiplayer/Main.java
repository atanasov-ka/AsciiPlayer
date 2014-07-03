package com.asciiplayer;
import java.io.IOException;
import java.nio.file.Paths;


public class Main {
	public static void main(String[] args) {
		if (args.length <= 1)
			return;
		
		Player player;
		try {
			player = PlayerFactory.newPlayer(Paths.get(args[1]));
			player.play();
		} catch (IOException | UnknownResourceTypeException e) {
			e.printStackTrace();
		}
		
	}
}
