package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.BoardVO;

@Mapper
public interface BoardMapper {

	int insert(BoardVO bvo);

	List<BoardVO> getlist();

//	int readCount(long bno);

	BoardVO getDetail(long bno);

	int update(BoardVO bvo);

	int delete(long bno);

}