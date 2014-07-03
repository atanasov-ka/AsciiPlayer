package com.asciiplayer;
import java.io.IOException;
import java.nio.file.Paths;


public class Main {
	public static void main(String[] args) throws IOException {
		if (args.length == 0)
			return;
		
		Player player = null;
	
			try {
				player = PlayerFactory.newPlayer(Paths.get(args[0]));
			} catch (UnknownResourceTypeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				player.play();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		
	}
}
