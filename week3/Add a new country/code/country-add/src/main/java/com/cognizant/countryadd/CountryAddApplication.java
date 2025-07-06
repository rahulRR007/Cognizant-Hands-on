package com.cognizant.countryadd;

import com.cognizant.countryadd.model.Country;
import com.cognizant.countryadd.service.CountryService;
import com.cognizant.countryadd.service.exception.CountryNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CountryAddApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryAddApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CountryAddApplication.class, args);
        countryService = context.getBean(CountryService.class);

        try {
            testAddCountry();
        } catch (CountryNotFoundException e) {
            LOGGER.error("Country not found", e);
        }
    }

    private static void testAddCountry() throws CountryNotFoundException {
        LOGGER.info("Start");

        Country newCountry = new Country();
        newCountry.setCode("XY");
        newCountry.setName("Xylophonia");

        countryService.addCountry(newCountry);

        Country saved = countryService.findCountryByCode("XY");
        LOGGER.debug("Saved Country: {}", saved);

        LOGGER.info("End");
    }
}
