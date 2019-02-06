package pacman.modele;

import java.util.*;


public class Characters extends ListDecorator<MobileElement> {

    public MobileElement get(int x, int y) {
        for (MobileElement character : this) {
            if (character.getX() == x && character.getY() == y) {
                return character;
            }
        }
        return null;
    }
}
