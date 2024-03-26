package com.gdu.prj09.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;

import com.gdu.prj09.dto.MemberDto;

public interface MemberService {
  // @ResponseBody 를 가지고 있음 일종의 wrapper
  ResponseEntity<Map<String, Object>> getMembers(int page, int display);
  ResponseEntity<Map<String, Object>> getMemberByNo(int memberNo);
  ResponseEntity<Map<String, Object>> registerMember(Map<String, Object> map, HttpServletResponse response); // email 전달 후 1. 정상 처리 되었다. 2. exception 처리 되었다. 로 나누기.
  ResponseEntity<Map<String, Object>> modifyMember(MemberDto member);
  ResponseEntity<Map<String, Object>> removeMember(int memberNo);
  ResponseEntity<Map<String, Object>> removeMembers(String memberNoList);   //@DeleteMapping ==> /members/1 string 형태로
}

/*
/members ----> getMembers(int page, int display) -----> getTotalMemberCount()
                                                        getMemberList(Map map)
                                                        
*/