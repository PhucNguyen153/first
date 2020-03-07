package com.me.yolo.repository;

import com.me.yolo.entity.Level;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepo extends CrudRepository<Level, Integer> {
}
