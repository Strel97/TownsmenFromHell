package com.strel.townsmen.game;

import com.strel.townsmen.engine.utils.ImageLoader;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by strel on 19.05.15.
 */
public interface GameConfig {

    public int DEFAULT_WIDTH            = 1000;
    public int DEFAULT_HEIGHT           = 500;
    public int SCALE                    = 3;

    public Color COLOR_BACKGROUND       = new Color(0x000000);
    public Color COLOR_ENTITY           = new Color(0xFFFFFF);

    // Map tiles constants
    public int TILE_SIZE = 16;

    public int GRASS_TILE = 0;
    public int PLAYER_TILE = 9;


    // Object map constants
    public int TREE_OBJ = 1;
    public int HOUSE_OBJ = 2;

    public int OBJECT_MAP_Z = 11;


    // Player config
    public int PLAYER_DX = 1;
    public int PLAYER_DY = 1;


    // Font config
    public int FONT_SIZE = 8;

    public int FONT_IMG_LETTER_X = 0;
    public int FONT_IMG_LETTER_Y = 0;

    public int FONT_IMG_DIGIT_X = 0;
    public int FONT_IMG_DIGIT_Y = 1;


    // Menu config
    public int MENU_OPTIONS_PADDING = 20;

    public int MENU_MAIN_X = 160;
    public int MENU_MAIN_Y = 80;


    // Debug config
    public int DEBUG_WND_X = 10;
    public int DEBUG_WND_Y = 10;

    public int DEBUG_WND_HEIGHT = 50;
    public int DEBUG_WND_WIDTH = 50;

    public Color DEBUG_WND_BACKGROUND = Color.blue;
    public Color DEBUG_WND_FOREGROUND = Color.white;


    // Game images
    public BufferedImage IMG_GRASS = ImageLoader.loadImage("src/main/resources/block.png");
    public BufferedImage IMG_TREE = ImageLoader.loadImage("src/main/resources/tree.png");
    public BufferedImage IMG_PLAYER = ImageLoader.loadImage("src/main/resources/player.png");
    public BufferedImage IMG_HOUSE = ImageLoader.loadImage("src/main/resources/house.png");
}
