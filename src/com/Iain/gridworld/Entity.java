package com.Iain.gridworld;

import java.awt.image.BufferedImage;

public class Entity {
	private int x;
	private int y;
	private int trueX;
	private int trueY;
	private int textureWidth;
	private int textureHeight;
	private BufferedImage entityTexture;
	
	public Entity(int x, int y, BufferedImage texture) {
		this.x = x;
		this.y = y;
		this.entityTexture = texture;
		this.textureWidth = texture.getWidth();
		this.textureHeight = texture.getHeight();
		this.trueX = x * trueX;
		this.trueY = y * trueY;
	}

}
