package wordsgame.service;

import java.util.List;
import java.util.Optional;
import wordsgame.model.City;

public interface CityService {
    Optional<City> get(Long id);

    List<City> getAll();

    List<City> addAll(List<City> city);

    String getFirstCity();

    String getNext(String word);
}
