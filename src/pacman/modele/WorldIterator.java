package pacman.modele;

import java.util.Iterator;

public class WorldIterator implements Iterator<StaticElement> {

    private World world;

    private int x = 0;
    private int y = 0;

    public WorldIterator(World world) {
        this.world = world;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public StaticElement next() {
        StaticElement next = world.getElements()[y][x];
        return next;
    }

}
