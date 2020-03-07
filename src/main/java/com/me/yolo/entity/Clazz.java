package com.me.yolo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Class")
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clazz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "catechists_id")
    private Catechists catechists;

    @Column
    private Integer level_id;

    @Column
    private Boolean active;
}
