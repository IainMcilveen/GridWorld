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
	
	public Entity(int x, int y, int textWid, int textH, BufferedImage texture) {
		this.x = x;
		this.y = y;
		this.textureWidth = textWid;
		this.textureHeight = textH;
		this.trueX = x * trueX;
		this.trueY = y * trueY;
		this.entityTexture = texture;
		
	}

}
