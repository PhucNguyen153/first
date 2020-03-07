package com.me.yolo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Catechists")
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Catechists {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private Integer parish_id;

    @Column
    private String phoneNum;

    @OneToOne
    @JoinColumn(name = "class_id")
    private Clazz clazz;

    @Column
    private Integer role_id;

    @Column
    private Boolean active;
}
