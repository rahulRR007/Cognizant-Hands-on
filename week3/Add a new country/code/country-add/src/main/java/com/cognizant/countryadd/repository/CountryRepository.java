package com.cognizant.countryadd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.countryadd.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
