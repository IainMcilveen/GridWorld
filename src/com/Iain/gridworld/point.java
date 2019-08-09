package com.Iain.gridworld;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class point {

	private int x;
	private int trueX;
	private int y;
	private int trueY;
	private int widthSize;
	private int heightSize;
	private BufferedImage texture;
	private boolean walk;

	public point(int x, int y, int height, int width) {
		this.x = x;
		this.y = y;
		this.widthSize = width;
		this.heightSize = height;
		this.trueX = x * width;
		this.trueY = y * height;
		
		int randomNum = (int)(Math.random() * 100);
		if(randomNum < 65) {
			try {
				this.texture = ImageIO.read(new File("C:\\java files\\GridWorld\\src\\com\\Iain\\gridworld\\textures\\sand.gif"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.walk = true;
		}else if (randomNum < 85) {
			try {
				this.texture = ImageIO.read(new File("C:\\java files\\GridWorld\\src\\com\\Iain\\gridworld\\textures\\puddle.gif"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.walk = true;
		}else if(randomNum < 90) {
			try {
				this.texture = ImageIO.read(new File("C:\\java files\\GridWorld\\src\\com\\Iain\\gridworld\\textures\\rock.gif"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.walk = false;
		}else if(randomNum < 95) {
			try {
				this.texture = ImageIO.read(new File("C:\\java files\\GridWorld\\src\\com\\Iain\\gridworld\\textures\\cacti.gif"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			this.walk = false;
		}else {
			try {
				this.texture = ImageIO.read(new File("C:\\java files\\GridWorld\\src\\com\\Iain\\gridworld\\textures\\tree.gif"));
			} catch (IOException e) {
				e.printStackTrace();
			}
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

	public BufferedImage getTexture() {
		return texture;
	}

	public void setTexture(BufferedImage texture) {
		this.texture = texture;
	}

}
