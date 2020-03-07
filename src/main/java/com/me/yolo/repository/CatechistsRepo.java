package com.me.yolo.repository;

import com.me.yolo.entity.Catechists;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatechistsRepo extends CrudRepository<Catechists, Integer> {

    @Query(value = "SELECT c FROM Catechists c WHERE c.active is true")
    Page<Catechists> pagingCatechists(Pageable pageable);
}
