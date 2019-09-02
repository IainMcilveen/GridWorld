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
	private BufferedImage player;
	
	
	public enum textures{
		SAND,ROCK,CACTI,TREE,PUDDLE,PLAYER;
	}
	
	
	public texture() {
		try {
			String currentDirectory = System.getProperty("user.dir");
			//System.out.println(currentDirectory);
			this.sand = ImageIO.read(new File(currentDirectory+"\\src\\com\\Iain\\gridworld\\textures\\sand.gif"));
			this.rock = ImageIO.read(new File(currentDirectory+"\\src\\com\\Iain\\gridworld\\textures\\rock.gif"));
			this.cacti = ImageIO.read(new File(currentDirectory+"\\src\\com\\Iain\\gridworld\\textures\\cacti.gif"));
			this.tree = ImageIO.read(new File(currentDirectory+"\\src\\com\\Iain\\gridworld\\textures\\tree.gif"));
			this.puddle = ImageIO.read(new File(currentDirectory+"\\src\\com\\Iain\\gridworld\\textures\\puddle.gif"));
			this.player = ImageIO.read(new File(currentDirectory+"\\src\\com\\Iain\\gridworld\\textures\\player.png"));
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
		case PLAYER:
			return this.player;
		}return this.sand;
		
	}

	public BufferedImage getPlayer() {
		return player;
	}

}
