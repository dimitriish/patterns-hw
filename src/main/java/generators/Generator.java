package generators;

public abstract class Generator<T> {

    protected abstract T generateParams(int code);

    public final T buildResponse(final int code) {
        return generateParams(code);
    }


}
