package com.cognizant.countrymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.countrymanagement.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
