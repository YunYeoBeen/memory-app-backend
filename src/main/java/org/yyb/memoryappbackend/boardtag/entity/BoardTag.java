package org.yyb.memoryappbackend.boardtag.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.yyb.memoryappbackend.board.entity.Board;
import org.yyb.memoryappbackend.tag.Tag;

@Entity
@NoArgsConstructor
@Getter
public class BoardTag {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id")
    private Tag tag;

}
