package com.Iain.gridworld;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.Iain.gridworld.texture.textures;

public class point {

	public boolean isWalk() {
		return walk;
	}

	public void setWalk(boolean walk) {
		this.walk = walk;
	}

	private int x;
	private int trueX;
	private int y;
	private int trueY;
	private int widthSize;
	private int heightSize;
	private textures texture;
	private boolean walk;

	public point(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.widthSize = width;
		this.heightSize = height;
		this.trueX = x * width;
		this.trueY = y * height;
		
		int randomNum = (int)(Math.random() * 100);
		if(randomNum < 84) {
			this.texture = texture.SAND; 
			this.walk = true;
		}else if (randomNum < 88) {
			this.texture = texture.PUDDLE;
			this.walk = true;
		}else if(randomNum < 95) {
			this.texture = texture.ROCK;
			this.walk = false;
		}else if(randomNum < 98) {
			this.texture = texture.CACTI;
			this.walk = false;
		}else {
			this.texture = texture.TREE;
			this.walk = false;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getTrueX() {
		return trueX;
	}

	public void setTrueX(int trueX) {
		this.trueX = trueX;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getTrueY() {
		return trueY;
	}

	public void setTrueY(int trueY) {
		this.trueY = trueY;
	}

	public int getWidthSize() {
		return widthSize;
	}

	public void setWidthSize(int widthSize) {
		this.widthSize = widthSize;
	}

	public int getHeightSize() {
		return heightSize;
	}

	public void setHeightSize(int heightSize) {
		this.heightSize = heightSize;
	}

	public textures getTexture() {
		return texture;
	}

	public void setTexture(textures texture) {
		this.texture = texture;
	}

}
