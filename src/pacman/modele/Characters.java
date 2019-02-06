package pacman.modele;

import java.util.*;


public class Characters extends ListMobileElementDecorator {

    private List<MobileElement> decorated = new ArrayList<>();

    public MobileElement get(int x, int y) {
        for (MobileElement character : decorated) {
            if (character.getX() == x && character.getY() == y) {
                return character;
            }
        }
        return null;
    }

}
