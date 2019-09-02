package com.Iain.gridworld;

import java.awt.image.BufferedImage;

public class Entity {
	protected int x;
	protected int y;
	protected int trueX;
	protected int trueY;
	protected int textureWidth;
	protected int textureHeight;
	protected BufferedImage entityTexture;
	protected grid worldGrid;
	protected MainEngine main;
	
	public Entity(MainEngine main,int x, int y, int imgWidth, int imgHeight, BufferedImage texture, grid worldGrid) {
		this.main = main;
		this.x = x;
		this.y = y;
		this.entityTexture = texture;
		this.textureWidth = imgWidth;
		this.textureHeight = imgHeight;
		this.trueX = x * this.textureWidth;
		this.trueY = y * this.textureHeight;
		this.worldGrid = worldGrid;
	}
	
	public void updateCoords() {
		this.trueX = x * this.textureWidth;
		this.trueY = y * this.textureHeight;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getTrueX() {
		return trueX;
	}

	public void setTrueX(int trueX) {
		this.trueX = trueX;
	}

	public int getTrueY() {
		return trueY;
	}

	public void setTrueY(int trueY) {
		this.trueY = trueY;
	}

	public int getTextureWidth() {
		return textureWidth;
	}

	public void setTextureWidth(int textureWidth) {
		this.textureWidth = textureWidth;
	}

	public int getTextureHeight() {
		return textureHeight;
	}

	public void setTextureHeight(int textureHeight) {
		this.textureHeight = textureHeight;
	}

	public BufferedImage getEntityTexture() {
		return entityTexture;
	}

	public void setEntityTexture(BufferedImage entityTexture) {
		this.entityTexture = entityTexture;
	}

}
