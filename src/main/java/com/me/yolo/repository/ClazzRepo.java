package com.me.yolo.repository;

import com.me.yolo.entity.Clazz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClazzRepo extends CrudRepository<Clazz, Integer> {

    @Query(value = "SELECT c FROM Clazz c WHERE c.active is true")
    Page<Clazz> pagingClass(Pageable pageable);
}
