package com.asciiplayer;

import java.awt.Color;
import java.awt.image.BufferedImage;

public class PlayerUtils {
	public static String stringify(BufferedImage image, int columns)
	{
		int width = image.getWidth();
		int height = image.getHeight();
		int blockSize = width / columns;
		
		int widthBlocks = width / blockSize;
		int heigthBlocks = height / blockSize;
		
		StringBuilder picture = new StringBuilder();
		for (int i = 0; i < heigthBlocks; ++i) {
			for (int j = 0; j < widthBlocks; j++) {
				int intens = getIntenseFromBlock(i, j, blockSize, image);
				picture.append(intensToString(intens));
			}
			picture.append("\n");
		}
		
		return picture.toString();
	}
	
	private static int getIntenseFromBlock(int h, int w, int blockSize, BufferedImage buffer) {
		int heightBufferStart = h * blockSize;
		int widthBufferStart = w * blockSize;
		int accumulator = 0;
		Color c = null;
		for (int i = 0; i < blockSize; i++) {
			for (int j = 0; j < blockSize; j++) {
				c = new Color(buffer.getRGB(widthBufferStart + i, heightBufferStart + j), false);
				accumulator += c.getBlue() + c.getGreen() + c.getRed();
			}
		}
		
		return accumulator / (blockSize * blockSize * 3);
	}
	
	private static String intensToString(int intensity)
	{
		 if      (intensity > 220 && intensity <= 255) return "  ";
		 else if (intensity > 180 && intensity <= 220) return "--";
		 else if (intensity > 140 && intensity <= 180) return "**";
		 else if (intensity > 100 && intensity <= 140) return "##";
		 else if (intensity > 60  && intensity <= 100) return "88";
		 else if (intensity > 20 && intensity  <= 60)  return "&&";
		 else                                          return "@@";
	}
}
