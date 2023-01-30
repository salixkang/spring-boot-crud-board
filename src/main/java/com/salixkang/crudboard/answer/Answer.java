package com.salixkang.crudboard.answer;

import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.*;

import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import com.salixkang.crudboard.user.SiteUser;
import com.salixkang.crudboard.question.Question;
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

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;

    @ManyToMany
    Set<SiteUser> voter;
}
