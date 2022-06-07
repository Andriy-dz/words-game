package wordsgame.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import org.springframework.stereotype.Service;
import wordsgame.dao.CityDao;
import wordsgame.model.City;

@Service
public class CityServiceImpl implements CityService {
    private String lastWord;
    private final CityDao dao;

    public CityServiceImpl(CityDao cityDao) {
        this.dao = cityDao;
    }

    @Override
    public Optional<City> get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<City> getAll() {
        return dao.findAll();
    }

    @Override
    public List<City> addAll(List<City> city) {
        return dao.saveAll(city);
    }

    @Override
    public String getFirstCity() {
        List<City> cities = getAll();
        return updateLastWord(cities.get(new Random().nextInt(cities.size())).getCityName());
    }

    @Override
    public String getNext(String word) {
        if (word.length() <= 2) {
            return "Your word must be longer than 2 letters. Try again!"
                    + " \n (Guessing word " + lastWord + ")";
        }
        return (word.substring(0,1).equalsIgnoreCase(lastWord.substring(lastWord.length() - 1)))
                ? updateLastWord(dao.findByFirstLetter(
                        word.substring(word.length() - 1).toUpperCase()).getCityName())
                : "Your word starts with the wrong letter. Try again!"
                + " \n (Guessing word " + lastWord + ")";
    }

    private String updateLastWord(String newWord) {
        lastWord = newWord;
        return lastWord;
    }
}
