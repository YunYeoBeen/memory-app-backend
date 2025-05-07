package org.yyb.memoryappbackend.board.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.yyb.memoryappbackend.tag.Tag;

import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
public class BoardResponseDto {
    private int id;
    private String nickname;
    private String title;
    private String description;
    private String imageUrl;
    private List<Tag> tags;
    private Timestamp createdAt;
}
