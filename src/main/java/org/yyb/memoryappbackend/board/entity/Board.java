package org.yyb.memoryappbackend.board.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.yyb.memoryappbackend.common.BaseEntity;

@Entity
@NoArgsConstructor
@Getter
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    private String contents;

    private String title;

    private String nickName;

}
