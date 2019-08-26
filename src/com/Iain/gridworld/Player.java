package com.Iain.gridworld;

import java.awt.image.BufferedImage;

public class Player extends Entity {
	
	private String name;
	
	public Player(int x, int y, int imgWidth, int imgHeight, BufferedImage texture, String name) {
		super(x,y,imgWidth,imgHeight,texture);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
