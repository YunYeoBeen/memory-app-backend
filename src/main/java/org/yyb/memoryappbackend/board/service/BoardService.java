package org.yyb.memoryappbackend.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yyb.memoryappbackend.board.entity.Board;
import org.yyb.memoryappbackend.board.repository.BoardRepository;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public void save() {

    }
}
