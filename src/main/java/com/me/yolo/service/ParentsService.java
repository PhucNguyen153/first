package com.me.yolo.service;

import com.me.yolo.entity.Parents;
import com.me.yolo.model.Pagination;
import com.me.yolo.repository.ParentsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ParentsService {

    @Autowired
    private ParentsRepo parentsRepo;

    public Pagination<Parents> pagingParents(int page, int size){
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Parents> result = parentsRepo.pagingParents(pageRequest);
        Pagination<Parents> pagination = new Pagination<>();
        pagination.copy(result);
        return pagination;
    }

    public Parents create(Parents Parents){
        Parents.setActive(true);
        return parentsRepo.save(Parents);
    }

    public Parents update(Parents Parents){
        return parentsRepo.save(Parents);
    }

    public boolean delete(Integer id){
        return true;
    }
}
