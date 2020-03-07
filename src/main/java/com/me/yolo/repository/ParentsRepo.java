package com.me.yolo.repository;

import com.me.yolo.entity.Parents;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentsRepo extends CrudRepository<Parents, Integer> {

    @Query(value = "SELECT p FROM Parents p WHERE p.active is true")
    Page<Parents> pagingParents(Pageable pageable);
}
