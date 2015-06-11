package com.strel.townsmen.game.objects.resources;

import com.strel.townsmen.game.objects.GameObject;

import java.awt.*;

/**
 * Created by strel on 11.06.15.
 */
public abstract class ResourceObject extends GameObject {

    protected Resource resource;


    public ResourceObject(int x, int y, Resource resource) {
        super(x, y);
        this.resource = resource;
    }

    public Resource getResource() {
        return resource;
    }
}
