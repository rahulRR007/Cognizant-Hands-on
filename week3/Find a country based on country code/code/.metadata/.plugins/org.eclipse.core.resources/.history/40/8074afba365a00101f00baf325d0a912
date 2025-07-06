package com.cognizant.countrymanagement;

import com.cognizant.countrymanagement.model.Country;
import com.cognizant.countrymanagement.service.CountryService;
import com.cognizant.countrymanagement.service.exception.CountryNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CountryManagementApplication {

    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CountryManagementApplication.class, args);
        countryService = context.getBean(CountryService.class);

        try {
            testFindCountryByCode();
        } catch (CountryNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void testFindCountryByCode() throws CountryNotFoundException {
        Country country = countryService.findCountryByCode("IN");
        System.out.println("Country: " + country);
    }
}
