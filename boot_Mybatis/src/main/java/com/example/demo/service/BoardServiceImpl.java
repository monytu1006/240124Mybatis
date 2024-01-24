package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.BoardVO;
import com.example.demo.repository.BoardMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;

	@Override
	public int insert(BoardVO bvo) {
		log.info(">>>>>seviceImpl bvo"+bvo);
		
		int isOk = mapper.insert(bvo);
		log.info(">>>>>>>>>>>>>>>>>>>>> insert is"+(isOk>0?"OK":"Fail"));
		
		return isOk;
	}

	@Override
	public List<BoardVO> getlist() {
		log.info(">>>>> getlist SeviceImpl bvo");
		
		return mapper.getlist();
	}

	@Override
	public BoardVO getDetail(long bno) {
		log.info(">>>>> getdetail SeviceImpl bvo");
//		int isOk = mapper.readCount(bno);
//		log.info("readCount is "+((isOk>0)?"OK":"Fail"));
		return mapper.getDetail(bno);
	}

	@Override
	@Transactional
	public int modify(BoardVO bvo) {
		log.info("modify service impl");
		
		int isOk = mapper.update(bvo);
		return isOk;
	}

	@Override
	public int delete(long bno) {
		log.info("delete service impl");
		
		int isOk = mapper.delete(bno);
		return isOk;
	}
		
	
}