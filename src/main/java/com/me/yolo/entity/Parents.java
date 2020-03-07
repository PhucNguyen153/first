package com.me.yolo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "Parents")
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String phoneNum;

    @Column
    private String fatherName;

    @Column
    private String motherName;

    @Column
    private Boolean active;

}
