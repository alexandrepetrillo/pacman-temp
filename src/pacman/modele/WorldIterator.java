package pacman.modele;

import java.util.Iterator;

public class WorldIterator implements Iterator<StaticElement> {

    private World world;

    public WorldIterator(World world) {
        this.world = world;
    }

    @Override
    public boolean hasNext() {
        //TODO
        return false;
    }

    @Override
    public StaticElement next() {
        //TODO
        return null;
    }

}
