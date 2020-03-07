package com.me.yolo.repository;

import com.me.yolo.entity.Parish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParishRepo extends CrudRepository<Parish, Integer> {

    @Query(value = "SELECT p FROM Parish p WHERE p.active is true")
    Page<Parish> pagingParish(Pageable pageable);
}
