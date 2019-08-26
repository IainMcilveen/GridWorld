package com.Iain.gridworld;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;

public class MainEngine {

	// main attributes
	private boolean running;
	private Graphics graphics;
	private BufferStrategy buffStrat;
	private JFrame frame;
	private Canvas canvas;
	private int gridWidth;
	private int gridHeight;
	private ArrayList<grid> world = new ArrayList<grid>();
	private Input inputObj;
	private Player player;

	// constructor
	public MainEngine(int gridWidth, int gridHeight) {
		frame = new JFrame("grid world");
		canvas = new Canvas();
		this.gridWidth = gridWidth;
		this.gridHeight = gridHeight;
		this.inputObj = new Input();
		world.add(new grid(0,0,gridWidth,gridHeight));
		this.player = new Player();
		
	}

	// start the program
	public void start() {
		running = true;
		run();
	}

	// initalize the window
	public void init() {
		//adds keylistener to canvas 
		canvas.addKeyListener(inputObj);
		canvas.setPreferredSize(new Dimension(800, 600));
		frame.add(canvas);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	// update game logic
	public void tick() {
	}

	// draw to the screen
	public void render() {
		if (buffStrat == null) {
			canvas.createBufferStrategy(2);
			buffStrat = canvas.getBufferStrategy();
			graphics = buffStrat.getDrawGraphics();
		}
		graphics.clearRect(0, 0, 800, 600);
		
		texture textureRetreve = new texture();
		// drawing a grid
		for (point[] yGrid : (world.get(0)).getTextures()) {
			for (point point : yGrid) {
				BufferedImage temp = textureRetreve.getTexture(point.getTexture());
				graphics.drawImage(temp, point.getTrueX(), point.getTrueY(), point.getWidthSize(), point.getHeightSize(), null);
			}
		}
		
		//drawing player
		

		graphics.setColor(Color.green);

		buffStrat.show();
		

	}

	// end the game
	public void term() {

	}

	// actually run the game
	public void run() {
		long time;
		long lastTick = 0;
		long lastSecond = 0;
		final long second = 1000000000;
		final long tickTime = second / 60;
		int frames = 0;
		int ticks = 0;

		init();

		while (isRunning()) {
			time = System.nanoTime();
			if ((time - lastTick) > tickTime) {
				tick();
				ticks++;
				lastTick = time;
			}
			render();
			frames++;
			if ((time - lastSecond) > second) {
				System.out.println(ticks + " " + frames);
				ticks = frames = 0;
				lastSecond = time;
			}
		}
		term();
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public static void main(String[] args) {
		new MainEngine(20,15).start();
	}

}
