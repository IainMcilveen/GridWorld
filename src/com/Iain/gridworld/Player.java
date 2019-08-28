package com.Iain.gridworld;

import java.awt.image.BufferedImage;

public class Player extends Entity {
	
	private String name;
	
	public Player(int x, int y, int imgWidth, int imgHeight, BufferedImage texture, String name) {
		super(x,y,imgWidth,imgHeight,texture);
		this.name = name;
	}
	
	public void moveForward() {
		if(this.y > 0) {
			this.y -= 1;
			this.updateCoords();
		}
	}
	
	public void moveBack() {
		if(this.y < (600/this.textureHeight)-1) {
			this.y += 1;
			this.updateCoords();
		}
	}
	
	public void moveRight() {
		if(this.x < (800/this.textureWidth)-1) {
			this.x += 1;
			this.updateCoords();
		}
	}
	
	public void moveLeft() {
		if(this.x > 0) {
			this.x -= 1;
			this.updateCoords();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
