package org.yyb.memoryappbackend.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yyb.memoryappbackend.board.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
}
