package com.Iain.gridworld;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

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
	private point[][] grid;

	// constructor
	public MainEngine(int gridWidth, int gridHeight) {
		frame = new JFrame("grid game");
		canvas = new Canvas();
		this.gridWidth = gridWidth;
		this.gridHeight = gridHeight;
		grid = new point[gridHeight][gridWidth];
	}

	// start the program
	public void start() {
		running = true;
		run();
	}

	// initalize the window
	public void init() {
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

		// drawing a grid
		for (point[] yGrid : grid) {
			for (point point : yGrid) {
				// graphics.setColor(point.getColour());
				// graphics.fillRect(square.getTrueX(), square.getTrueY(),
				// square.getWidthSize(), square.getHeightSize());
			}
		}

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
		new MainEngine(8, 6).start();
	}

}
