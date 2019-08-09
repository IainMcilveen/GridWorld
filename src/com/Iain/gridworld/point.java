package com.Iain.gridworld;

import java.awt.image.BufferedImage;

public class point {

	private int x;
	private int trueX;
	private int y;
	private int trueY;
	private int widthSize;
	private int heightSize;
	private BufferedImage texture;

	public point(int x, int y, int height, int width, BufferedImage texture) {
		this.x = x;
		this.y = y;
		this.widthSize = width;
		this.heightSize = height;
		this.trueX = x * width;
		this.trueY = y * height;
		this.texture = texture;
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

	public BufferedImage getTexture() {
		return texture;
	}

	public void setTexture(BufferedImage texture) {
		this.texture = texture;
	}

}
