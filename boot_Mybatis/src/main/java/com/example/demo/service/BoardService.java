package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.BoardVO;

public interface BoardService {

	int insert(BoardVO bvo);

	List<BoardVO> getlist();

	BoardVO getDetail(long bno);

	int modify(BoardVO bvo);

	int delete(long bno);
	

}
