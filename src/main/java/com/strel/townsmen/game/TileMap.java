package com.strel.townsmen.game;

import com.strel.townsmen.game.objects.EmptyTile;
import com.strel.townsmen.game.objects.GrassTile;
import com.strel.townsmen.game.objects.Player;
import com.strel.townsmen.game.objects.Tile;
import com.strel.townsmen.game.utils.IsometricConverter;

import java.awt.*;

/**
 * Created by strel on 10.06.15.
 */
public class TileMap {

    private Tile[][] map;

    public TileMap() {
        /*
        TODO: Must be replaced by loading map from  file
         */
        int[][] map = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };

        parseMap(map);
    }

    public void parseMap(int[][] map) {

        this.map = new Tile[map.length][map[0].length];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                Point isometric = IsometricConverter.tileCoordToIsometric(i, j);
                this.map[i][j] = parseTile(map[i][j], isometric.x, isometric.y);
            }
        }
    }

    public Tile parseTile(int id, int x, int y) {
        /*
        TODO: Must be replaced for something better. Maybe factory.
         */
        switch (id) {
            case GameConfig.GRASS_TILE:
                return new GrassTile(x, y);

            default:
                return new EmptyTile(x, y);
        }
    }

    public Tile getTile(int x, int y) {
        if (x >= 0 && x < map.length
                && y >= 0 && y < map[0].length)
            return map[x][y];

        return null;
    }

    public void update(long elapsedTime) {
    }

    public void draw(Graphics2D g) {
        for (Tile[] line : map) {
            for (Tile tile : line) {
                tile.draw(g);
            }
        }
    }
}
