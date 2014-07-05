package com.asciiplayer;
import java.io.IOException;
import java.nio.file.Paths;


public class Main {
	public static void main(String[] args) throws IOException {
		if (args.length < 2)
			return;
		
		Player player = null;
		try {
			player = PlayerFactory.newPlayer(Paths.get(args[0]), Integer.parseInt(args[1]));
		} catch (UnknownResourceTypeException e) {
			e.printStackTrace();
		}
		try {
			player.play();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
