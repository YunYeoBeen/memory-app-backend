package org.yyb.memoryappbackend.board.dto.request;

import lombok.Getter;
import lombok.Setter;
import org.yyb.memoryappbackend.board.entity.Board;
import org.yyb.memoryappbackend.tag.Tag;

import java.util.List;

@Getter
@Setter
public class BoardRequestDto {
    private String title;
    private String description;
    private List<Tag> tags;
    private String nickname;

    public Board toEntitiy() {
        /**
         * request -> title, des, nickname 저장
         * tags
         */
        return new Board(title, description, tags, nickname);
    }
}
