package com.me.yolo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
@NoArgsConstructor
public class Pagination<T> {

    private int totalPage;
    private int size;
    private int numOfElements;
    private long totalOfElements;
    private List<T> contents;

    public Pagination<T> copy(Page<T> page){
        Pagination<T> pagination = new Pagination<>();
        pagination.setTotalPage(page.getTotalPages());
        pagination.setSize(page.getSize());
        pagination.setNumOfElements(page.getNumberOfElements());
        pagination.setTotalOfElements(page.getTotalElements());
        pagination.setContents(page.getContent());
        return pagination;
    }
}
