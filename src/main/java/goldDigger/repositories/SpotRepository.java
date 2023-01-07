package goldDigger.repositories;

import goldDigger.models.spot.Spot;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class SpotRepository implements Repository<Spot>{

    private Map<String, Spot> spots;

    public SpotRepository() {
        this.spots = new LinkedHashMap<>();
    }


    @Override
    public Collection<Spot> getCollection() {
        return null;
    }

    @Override
    public void add(Spot entity) {

    }

    @Override
    public boolean remove(Spot entity) {
        return false;
    }

    @Override
    public Spot byName(String name) {
        return null;
    }
}
