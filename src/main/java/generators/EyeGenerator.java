package generators;

import person.Eye;

public class EyeGenerator extends Generator<Eye> {
    private final String[] colors = {"голубые", "зелёные", "карие", "серые", "разные"};

    @Override
    public final Eye generateParams(final int code) {
        final int i = code % 100 / 10;
        String color = colors[i / 2];
        return new Eye(color);
    }


}
