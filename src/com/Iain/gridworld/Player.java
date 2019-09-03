package com.Iain.gridworld;

import java.awt.image.BufferedImage;

public class Player extends Entity {
	
	private String name;
	private int worldX;
	private int worldY;
	
	public Player(MainEngine main, int x, int y, int imgWidth, int imgHeight, BufferedImage texture, grid worldGrid, String name) {
		super(main,x,y,imgWidth,imgHeight,texture, worldGrid);
		this.name = name;
		this.worldX = 0;
		this.worldY = 0;
	}
	
	public void moveForward() {
		if(this.y > 0) {
			point next = worldGrid.getTextures()[this.y-1][this.x];
			if(next.isWalk() == true) {
				this.y -= 1;
				this.updateCoords();
			}
		}else if(this.y == 0) {
			//System.out.println("top");
			//System.out.println(main.levelExists(this.worldX,this.worldY+1));
			grid levelExists = main.levelExists(this.worldX, this.worldY+1);
			if(levelExists == null) {
				grid newGrid = new grid(this.worldX,this.worldY+1,main.getGridWidth(),main.getGridHeight());
				main.addLevel(newGrid);
				this.worldGrid = newGrid;
				this.worldY += 1;
				this.y = worldGrid.getTextures().length-1;
				this.updateCoords();
			}else {
				this.worldGrid = levelExists;
				this.worldY += 1;
				this.y = worldGrid.getTextures().length-1;
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
		}else if(this.y+1 == worldGrid.getTextures().length) {
			//System.out.println("bottom");
			grid levelExists = main.levelExists(this.worldX, this.worldY-1);
			if(levelExists == null) {
				grid newGrid = new grid(this.worldX,this.worldY-1,main.getGridWidth(),main.getGridHeight());
				main.addLevel(newGrid);
				this.worldGrid = newGrid;
				this.worldY -= 1;
				this.y = 0;
				this.updateCoords();
			}else {
				this.worldGrid = levelExists;
				this.worldY -= 1;
				this.y = 0;
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
		}else if(this.x+1 == worldGrid.getTextures()[0].length) {
			//System.out.println("right");
			grid levelExists = main.levelExists(this.worldX+1, this.worldY);
			if(levelExists == null) {
				grid newGrid = new grid(this.worldX+1,this.worldY,main.getGridWidth(),main.getGridHeight());
				main.addLevel(newGrid);
				this.worldGrid = newGrid;
				this.worldX += 1;
				this.x = 0;
				this.updateCoords();
			}else {
				this.worldGrid = levelExists;
				this.worldX += 1;
				this.x = 0;
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
		}else if(this.x == 0) {
			//System.out.println("left");
			grid levelExists = main.levelExists(this.worldX-1, this.worldY);
			if(levelExists == null) {
				grid newGrid = new grid(this.worldX-1,this.worldY,main.getGridWidth(),main.getGridHeight());
				main.addLevel(newGrid);
				this.worldGrid = newGrid;
				this.worldX -= 1;
				this.x = worldGrid.getTextures()[0].length-1;
				this.updateCoords();
			}else {
				this.worldGrid = levelExists;
				this.worldX -= 1;
				this.x = worldGrid.getTextures()[0].length-1;
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
