package pacman.modele;

import java.util.Iterator;

public class World implements Iterable<StaticElement> {

    private StaticElement[][] elements;
    private int h;
    private int w;

    public World(int h, int w) {
        this.h = h;
        this.w = w;
        elements = new StaticElement[h][w];
    }

    @Override
    public Iterator<StaticElement> iterator() {
        return new WorldIterator(this);
    }

    public StaticElement[][] getElements() {
        return elements;
    }

    public void set(int x, int y, StaticElement staticElement) {
        elements[x][y] = staticElement;
    }

    public int getHeight() {
        return h;
    }

    public int getWidth() {
        return w;
    }

}
