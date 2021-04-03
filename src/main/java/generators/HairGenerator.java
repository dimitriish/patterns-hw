package generators;

import person.hair.Hair;
import person.hair.LongHair;
import person.hair.NoHair;
import person.hair.ShortHair;

import java.util.HashMap;

public class HairGenerator extends Generator<Hair> {

    private String hairColor;

    /*
     * Внешность генерируется по третьей цифре кода (i):
     * Глаза: по индексу i/2 (=0..4)
     * Длина волос: i
     * Цвет волос: из enum по индексу i-1 при i>0 (=0..8).
     */

    /**
     * @param code - input
     * @return hair color
     */
    public final Hair generateParams(final int code) {
        final int i = code % 100 / 10;

        final HashMap<Integer, String> hairColorMap = new HashMap<>() {{
            put(1, "чёрные");
            put(2, "каштановые");
            put(3, "рыжие");
            put(4, "светлые");
            put(5, "седые");
            put(6, "розовые");
            put(7, "зелёные");
            put(8, "фиолетовые");
            put(9, "синие");
        }};
        if (i > 0) {
            hairColor = hairColorMap.get(i);
        }
        Hair hair;
        if (i > 0) {
            hair = (i > 4) ? new LongHair(hairColor) : new ShortHair(hairColor);
        } else {
            hair = new NoHair();
        }
        return hair;
    }


}

