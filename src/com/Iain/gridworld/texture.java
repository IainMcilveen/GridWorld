package com.Iain.gridworld;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class texture {
	
	private BufferedImage sand;
	private BufferedImage rock;
	private BufferedImage cacti;
	private BufferedImage tree;
	private BufferedImage puddle;
	
	
	public enum textures{
		SAND,ROCK,CACTI,TREE,PUDDLE;
	}
	
	
	public texture() {
		try {
			this.sand = ImageIO.read(new File("C:\\java files\\GridWorld\\src\\com\\Iain\\gridworld\\textures\\sand.gif"));
			this.rock = ImageIO.read(new File("C:\\java files\\GridWorld\\src\\com\\Iain\\gridworld\\textures\\rock.gif"));
			this.cacti = ImageIO.read(new File("C:\\java files\\GridWorld\\src\\com\\Iain\\gridworld\\textures\\cacti.gif"));
			this.tree = ImageIO.read(new File("C:\\java files\\GridWorld\\src\\com\\Iain\\gridworld\\textures\\tree.gif"));
			this.puddle = ImageIO.read(new File("C:\\java files\\GridWorld\\src\\com\\Iain\\gridworld\\textures\\puddle.gif"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public BufferedImage getTexture(textures img) {
		switch(img) {
		case SAND:
			return this.sand;
		case ROCK:
			return this.rock;
		case CACTI:
			return this.cacti;
		case TREE:
			return this.tree;
		case PUDDLE:
			return this.puddle;	
		}return this.sand;
		
	}
}
