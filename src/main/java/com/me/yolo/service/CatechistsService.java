package com.me.yolo.service;

import com.me.yolo.entity.Catechists;
import com.me.yolo.model.Pagination;
import com.me.yolo.repository.CatechistsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CatechistsService {
    @Autowired
    private CatechistsRepo catechistsRepo;

    public Pagination<Catechists> pagingCatechists(int page, int size){
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<Catechists> result = catechistsRepo.pagingCatechists(pageRequest);
        Pagination<Catechists> pagination = new Pagination<>();
        pagination.copy(result);
        return pagination;
    }

    public Catechists create(Catechists catechists){
        catechists.setActive(true);
        return catechistsRepo.save(catechists);
    }

    public Catechists update(Catechists catechists){
        return catechistsRepo.save(catechists);
    }

    public boolean delete(Integer id){
        return true;
    }
}
