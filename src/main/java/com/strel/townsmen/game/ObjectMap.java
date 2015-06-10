package com.strel.townsmen.game;

import com.strel.townsmen.game.objects.*;
import com.strel.townsmen.game.utils.IsometricConverter;

import java.awt.*;

/**
 * Created by strel on 10.06.15.
 */
public class ObjectMap {

    private GameObject[][] map;


    /*
    TODO: ObjectMap and Tile Map are similar. We must try to
    TODO: move their functionality to one class
     */
    public ObjectMap() {
        /*
        TODO: Must be replaced by loading map from  file
         */
        int[][] map = {
                { 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1 },
                { 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 },
                { 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 },
                { 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2 },
                { 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2 }
        };

        parseMap(map);
    }

    public void parseMap(int[][] map) {

        this.map = new GameObject[map.length][map[0].length];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                Point isometric = IsometricConverter.tileCoordToIsometric(i, j);
                this.map[i][j] = parseObject(map[i][j], isometric.x, isometric.y - GameConfig.OBJECT_MAP_Z);
            }
        }
    }

    public GameObject parseObject(int id, int x, int y) {
        /*
        TODO: Must be replaced for something better. Maybe factory.
         */
        switch (id) {
            case GameConfig.TREE_OBJ:
                return new Tree(x, y);

            case GameConfig.HOUSE_OBJ:
                return new House(x, y);

            default:
                return new EmptyTile(x, y);
        }
    }

    public void addObject(int x, int y, GameObject obj) {
        map[x][y] = obj;
    }

    public void update(long elapsedTime) {

    }

    public void draw(Graphics2D g) {
        for (GameObject[] line : map) {
            for (GameObject obj : line) {
                obj.draw(g);
            }
        }
    }
}
