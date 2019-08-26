package com.Iain.gridworld;

import java.awt.image.BufferedImage;

public class Player extends Entity {
	
	private String name;
	
	public Player(int x, int y, BufferedImage texture, String name) {
		super(x,y,texture);
		this.name = name;
	}
	
	
	
}
