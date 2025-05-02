package org.yyb.memoryappbackend.tag;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.yyb.memoryappbackend.common.BaseEntity;

@Entity
@NoArgsConstructor
@Getter
public class Tag extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "tag_id")
    private Long id;

    @Column(unique = true)
    private String name;
}
