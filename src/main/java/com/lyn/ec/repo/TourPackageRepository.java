package com.lyn.ec.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.lyn.ec.domain.TourPackage;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    /**
     * Find Tour Package by name.
     *
     * @param name name of the package
     * @return Optional of TourPackage
     */
    
    Optional<TourPackage> findByName(@Param("name")String name);
}
