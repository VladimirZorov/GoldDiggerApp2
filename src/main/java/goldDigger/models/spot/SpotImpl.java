package goldDigger.models.spot;

import java.util.ArrayList;
import java.util.Collection;

public class SpotImpl implements Spot{

    private String name;
    private Collection<String> exhibits;

    public SpotImpl(String name) {
        this.name = name;
        this.exhibits = new ArrayList<>();
    }

    @Override
    public Collection<String> getExhibits() {
        return exhibits;
    }

    @Override
    public String getName() {
        return name;
    }
}
