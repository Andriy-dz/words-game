package wordsgame.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wordsgame.model.City;
import wordsgame.service.CityService;

@RestController
@RequestMapping("/inject")
public class Injector {
    private final CityService service;

    public Injector(CityService service) {
        this.service = service;
    }

    @PostMapping
    public String inject() {
        List<City> cities = List.of(
                new City("Agra"),
                new City("Basrah"),
                new City("Campinas"),
                new City("Dallas"),
                new City("Ecatepec"),
                new City("Fortaleza"),
                new City("Giza"),
                new City("HAVANA"),
                new City("Isfahen"),
                new City("Jinan"),
                new City("KHARKIV"),
                new City("Lagos"),
                new City("MADRID"),
                new City("New York City"),
                new City("Omdurman"),
                new City("PARIS"),
                new City("QUITO"),
                new City("Ranchi"),
                new City("Salvador"),
                new City("TBILISI"),
                new City("Ulsan"),
                new City("VIENNA"),
                new City("WARSAW"),
                new City("Xuzhou"),
                new City("Yerevan"),
                new City("Zibo")
                );
        service.addAll(cities);
        return "Data uploaded successfully";
    }
}
