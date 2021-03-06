package com.practive.study.model.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.practive.study.model.dao.MemberEndDao;
import com.practive.study.model.vo.Member;

@Service
public class MemberEndServiceImpl implements MemberEndService {
	
	@Autowired
	private MemberEndDao dao;
	
	// DB 연동
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insertMember(Member member) {
		System.out.println("2) Service입니댯!!!!!!!!");		
		return dao.insertMember(sqlSession,member);
	}

	@Override
	public int userIdCheck(String userId) {
		int result = dao.userIdCheck(sqlSession,userId);
		return result;
	}
	
	@Override
	public int loginCheck(Member member) {
		int result = dao.loginCheck(sqlSession,member);
		return result;
	}
}
