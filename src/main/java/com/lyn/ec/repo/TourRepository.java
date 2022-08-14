package com.lyn.ec.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.lyn.ec.domain.Tour;

public interface TourRepository extends CrudRepository<Tour, Integer> {
    /**
     * Find Tours associated with the Tour Package.
     *
     * @param code tour package code
     * @return List of found tours.
     */
    List<Tour> findByTourPackageCode(@Param("code") String code);
}
