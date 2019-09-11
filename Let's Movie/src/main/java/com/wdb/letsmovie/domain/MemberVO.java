package com.wdb.letsmovie.domain;

import lombok.Data;

@Data
public class MemberVO {
	private String id;
	private String password;
	private int zipcode;
}
