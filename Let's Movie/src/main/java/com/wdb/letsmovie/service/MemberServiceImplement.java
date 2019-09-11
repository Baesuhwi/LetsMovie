package com.wdb.letsmovie.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.wdb.letsmovie.domain.MemberVO;
import com.wdb.letsmovie.mapper.MemberMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberServiceImplement implements MemberService {
	private MemberMapper memberMapper;
	
	@Override
	public ArrayList<MemberVO> getList() {
		return memberMapper.getList();
	}
}
