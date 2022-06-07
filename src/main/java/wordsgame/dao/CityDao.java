package wordsgame.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import wordsgame.model.City;

@Repository
public interface CityDao extends JpaRepository<City, Long> {
    @Query(value = "FROM City c WHERE c.cityName LIKE ?1%")
    City findByFirstLetter(String letter);
}
