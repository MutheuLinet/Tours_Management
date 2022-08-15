package com.lyn.ec.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.lyn.ec.domain.Tour;

public interface TourRepository extends PagingAndSortingRepository<Tour, Integer> {
    /**
     * Find Tours associated with the Tour Package.
     *
     * @param code tour package code
     * @return List of found tours.
     */
//    List<Tour> findByTourPackageCode(@Param("code") String code);
	Page<Tour> findByTourPackageCode(@Param("code") String code, Pageable pageable);

	  //@Override & @RestResource features to stop public from modifying your database alternative way is spring security
	
//	@Override
//	@RestResource(exported=false)
//	default <S extends Tour> S save(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	@RestResource(exported=false)
//	default <S extends Tour> Iterable<S> saveAll(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	@RestResource(exported=false)
	default void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RestResource(exported=false)
	default void delete(Tour entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteAll(Iterable<? extends Tour> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	
}
