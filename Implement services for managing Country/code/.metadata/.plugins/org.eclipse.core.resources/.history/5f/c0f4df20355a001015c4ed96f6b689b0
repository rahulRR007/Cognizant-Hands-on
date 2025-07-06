package com.cognizant.ormlearn;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        testCountryOperations();
    }

    private static void testCountryOperations() {
        LOGGER.info("Start");

        // Add
        Country newCountry = new Country();
        newCountry.setCode("XY");
        newCountry.setName("ExampleLand");
        countryService.addCountry(newCountry);

        // Get
        Country c = countryService.getCountry("XY");
        LOGGER.debug("Get: {}", c);

        // Update
        countryService.updateCountry("XY", "UpdatedExampleLand");

        // Partial search
        List<Country> list = countryService.findByPartialName("land");
        LOGGER.debug("Search: {}", list);

        // Delete
        countryService.deleteCountry("XY");

        LOGGER.info("End");
    }
}
