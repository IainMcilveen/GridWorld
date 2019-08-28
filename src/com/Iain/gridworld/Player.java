package com.Iain.gridworld;

import java.awt.image.BufferedImage;

public class Player extends Entity {
	
	private String name;
	
	public Player(int x, int y, int imgWidth, int imgHeight, BufferedImage texture, grid worldGrid, String name) {
		super(x,y,imgWidth,imgHeight,texture, worldGrid);
		this.name = name;
	}
	
	public void moveForward() {
		if(this.y > 0) {
			point next = worldGrid.getTextures()[this.y-1][this.x];
			if(next.isWalk() == true) {
				this.y -= 1;
				this.updateCoords();
			}
		}
	}
	
	public void moveBack() {
		if(worldGrid.getTextures().length > this.y+1) {
			point next = worldGrid.getTextures()[this.y+1][this.x];
			if(next.isWalk() == true) {
				this.y += 1;
				this.updateCoords();
			}
		}
	}
	
	public void moveRight() {
		if(worldGrid.getTextures()[0].length > this.x+1) {
			point next = worldGrid.getTextures()[this.y][this.x+1];
			if(next.isWalk() == true) {
				this.x += 1;
				this.updateCoords();
			}
		}
	}
	
	public void moveLeft() {
		if(this.x > 0) {
			point next = worldGrid.getTextures()[this.y][this.x-1];
			if(next.isWalk() == true) {
				this.x -= 1;
				this.updateCoords();
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
