package com.cognizant.countrymanagement.service;

import com.cognizant.countrymanagement.model.Country;
import com.cognizant.countrymanagement.repository.CountryRepository;
import com.cognizant.countrymanagement.service.exception.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public Country findCountryByCode(String code) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(code);
        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country with code " + code + " not found");
        }
        return result.get();
    }

    // addCountry, updateCountry, deleteCountry, searchCountryByName
}
