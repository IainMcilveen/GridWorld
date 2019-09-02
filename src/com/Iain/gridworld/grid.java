package com.Iain.gridworld;

public class grid {
	
	private int gridPosX;
	private int gridPosY;
	private int gridWidth;
	private int gridHeight;
	private point[][] textures;
	
	public grid(int currentGridX,int currentGridY,int gridWidth,int gridHeight) {
		this.gridPosX = currentGridX;
		this.gridPosY = currentGridY;
		this.gridWidth = gridWidth;
		this.gridHeight = gridHeight;
		this.textures = generateLevel();
		
	}
	
	public point[][] generateLevel(){
		point[][] temp = new point[gridHeight][gridWidth];
		for (int y = 0; y < gridHeight; y++) {
			for (int x = 0; x < gridWidth; x++) {
				temp[y][x] = new point(x,y,800/gridWidth,600/gridHeight);
			}
		}
		return temp;
	}
	

	public int getGridPosX() {
		return gridPosX;
	}

	public void setGridPosX(int gridPosX) {
		this.gridPosX = gridPosX;
	}

	public int getGridPosY() {
		return gridPosY;
	}

	public void setGridPosY(int gridPosY) {
		this.gridPosY = gridPosY;
	}

	public point[][] getTextures() {
		return textures;
	}

	public void setTextures(point[][] textures) {
		this.textures = textures;
	}
	
	
}
