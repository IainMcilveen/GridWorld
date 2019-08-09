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
		public point[][] temp = null;
		for (int y = 0; y < gridHeight; y++) {
			for (int x = 0; x < gridWidth; x++) {
				temp[y][x] = new point()
			}
		}
		return;
	}
}
