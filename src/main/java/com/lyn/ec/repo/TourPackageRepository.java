package com.lyn.ec.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.lyn.ec.domain.TourPackage;

@RepositoryRestResource(collectionResourceRel = "packages", path = "packages")
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    /**
     * Find Tour Package by name.
     *
     * @param name name of the package
     * @return Optional of TourPackage
     */
    
    Optional<TourPackage> findByName(@Param("name")String name);

    //@Override & @RestResource features to stop public from modifying your database
    
//	@Override
//	@RestResource(exported=false) //method level annotation
//	default <S extends TourPackage> S save(S entity) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	@RestResource(exported=false)
//	default <S extends TourPackage> Iterable<S> saveAll(Iterable<S> entities) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	@RestResource(exported=false)
	default void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RestResource(exported=false)
	default void delete(TourPackage entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteAll(Iterable<? extends TourPackage> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@RestResource(exported=false)
	default void deleteAll() {
		// TODO Auto-generated method stub
		
	}
    
}
