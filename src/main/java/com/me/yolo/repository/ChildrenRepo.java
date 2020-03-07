package com.me.yolo.repository;

import com.me.yolo.entity.Children;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenRepo extends CrudRepository<Children, Integer> {

    @Query(value = "SELECT c FROM Children c WHERE c.active is true")
    Page<Children> pagingChildren(Pageable pageable);
}
