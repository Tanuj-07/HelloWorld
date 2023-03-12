package com.apcs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player {
    private int x; // x-coordinate of the player
    private int y; // y-coordinate of the player
    private int vx; // x-velocity of the player
    private int vy; // y-velocity of the player
    private BufferedImage img; // image of the player

    public Player() {
        x = 0;
        y = 0;
        vx = 0;
        vy = 0;
        try {
            img = ImageIO.read(new File("player.png"));
        } catch (IOException e) {
            System.out.println("Error loading player image");
        }
    }

    public void update() {
        // Update the player's position based on their velocity
        x += vx;
        y += vy;

        // Apply gravity to the player's y-velocity
        vy += 1;
    }

    public void moveLeft() {
        // Move the player to the left by decreasing their x-velocity
        vx -= 1;
    }

    public void moveRight() {
        // Move the player to the right by increasing their x-velocity
        vx += 1;
    }

    public void jump() {
        // Make the player jump by setting their y-velocity
        vy = -10;
    }

    public void draw(Graphics g) {
        // Draw the player's image at their current position
        g.drawImage(img, x, y, null);
    }
}