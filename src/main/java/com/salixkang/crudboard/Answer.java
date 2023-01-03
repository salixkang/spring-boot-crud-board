package com.salixkang.crudboard;

import java.time.LocalDateTime;

import javax.persistence.*;

import javax.persistence.ManyToOne;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;


}
