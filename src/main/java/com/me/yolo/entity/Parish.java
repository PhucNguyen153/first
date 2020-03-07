package com.me.yolo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Parish")
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Parish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String manager;

    @Column
    private String phoneNum;

    @Column
    private Boolean active;
}
