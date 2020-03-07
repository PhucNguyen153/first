package com.me.yolo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Children")
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Children {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private Integer parent_id;

    @Column
    private Integer parish_id;

    @Column
    private Integer class_id;

    @Column
    private Boolean active;
}
